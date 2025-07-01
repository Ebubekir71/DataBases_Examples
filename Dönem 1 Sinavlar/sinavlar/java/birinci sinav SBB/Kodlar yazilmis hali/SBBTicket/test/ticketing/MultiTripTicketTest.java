package ticketing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticketing.MultiTripTicket;
import ticketing.Zone;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MultiTripTicketTest {

    private Zone[] zones;
    private MultiTripTicket ticket;

    @BeforeEach
    public void setup() {
        zones = new Zone[]{Zone.ZONE_100, Zone.ZONE_101};
        ticket = new MultiTripTicket(zones);
    }

    @Test
    public void testConstructorInitializesCorrectly() {
        assertEquals(6, ticket.getNbOfUnusedTrips());
        assertNull(ticket.getLastStampedTicket());
    }

    @Test
    public void testStampAddsSingleTicket() {
        ticket.stamp(LocalDateTime.now());
        assertEquals(5, ticket.getNbOfUnusedTrips());
        assertNotNull(ticket.getLastStampedTicket());
    }

    @Test
    public void testIsValidAfterStamp() {
        ticket.stamp(LocalDateTime.now());
        boolean valid = ticket.isValid(Zone.ZONE_100, LocalDateTime.now());
        assertTrue(valid);
    }

    @Test
    public void testIsValidFailsWithoutStamp() {
        MultiTripTicket freshTicket = new MultiTripTicket(zones);
        boolean valid = freshTicket.isValid(Zone.ZONE_100, LocalDateTime.now());
        assertFalse(valid);
    }

    @Test
    public void testStampDoesNotExceedLimit() {
        for (int i = 0; i < 6; i++) {
            ticket.stamp(LocalDateTime.now());
        }

        // 7. basım yapılmamalı
        ticket.stamp(LocalDateTime.now());

        assertEquals(0, ticket.getNbOfUnusedTrips());
    }
}
