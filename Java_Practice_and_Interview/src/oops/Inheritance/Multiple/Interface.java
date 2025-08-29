package oops.Inheritance.Multiple;

	// Interface 1
	interface Musician {
	    void playMusic();
	}

	// Interface 2
	interface Singer {
	    void sing();
	}

	// Class implementing both interfaces
	class Performer implements Musician, Singer {
	    @Override
	    public void playMusic() {
	        System.out.println("The performer plays the piano.");
	    }

	    @Override
	    public void sing() {
	        System.out.println("The performer sings a song.");
	    }
	}

