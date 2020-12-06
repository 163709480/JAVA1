package DemoThreadlearning;

public class makefood extends Thread{
    public makefood(food fd) {
        this.fd = fd;
    }

    private food fd;

    @Override
    public void run() {
        while (true){
            synchronized (fd){
                if(fd.flag==true){
                    try {
                        fd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("add food........");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("food finish");
                fd.flag=true;
                fd.notify();


            }
        }

    }
}
