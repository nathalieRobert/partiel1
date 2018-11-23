package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.formation.partiel1.entities.BAN;


class BANTest {


    @Test
    void shouldConstruc() {
	assertDoesNotThrow(() -> {
	    new BAN(0, 0, null, 0);
	});
    }
    
    @Test
    void shouldNotConstruct() {
	assertThrows(NullPointerException.class, () -> {
	    new BAN(0, 0, null, 0);
	});
    }
    
}
