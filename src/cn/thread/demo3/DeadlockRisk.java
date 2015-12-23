package cn.thread.demo3;
public class DeadlockRisk { 
    private static class Resource { 
        public int value; 
    } 

    private Resource resourceA = new Resource(); 
    private Resource resourceB = new Resource(); 

    public int read() { 
        synchronized (resourceA) { 
            synchronized (resourceB) { 
            	System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
                return resourceB.value + resourceA.value; 
            } 
        } 
    } 

    public void write(int a, int b) { 
        synchronized (resourceB) { 
            synchronized (resourceA) { 
            	System.out.println("bbbbbbbbbbbbbb");
                resourceA.value = a; 
                resourceB.value = b; 
            } 
        } 
    } 
    
    public static void main(String[] args) {
    	final DeadlockRisk deadlockRisk = new DeadlockRisk();
    	
    	new Thread(new Runnable() {
			public void run() {
				while(true){
					try {
						Thread.currentThread().sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					deadlockRisk.read();
				}
			}
		}).start();;
    
		new Thread(new Runnable() {
			public void run() {
				while(true){
					try {
						Thread.currentThread().sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					deadlockRisk.write(1,3);
				}
			}
		}).start();;
    }
    
}