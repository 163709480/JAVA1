package DemoThreadlearning;

public class customer extends Thread{
    public customer(food fd) {
        this.fd = fd;
    }

    private food fd;

    @Override
    public void run() {
        while (true){
            synchronized (fd){
                if(fd.flag==false){

                    try {
                        fd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
                System.out.println("eat food");
                fd.flag=false;
                fd.notify();
                System.out.println("finish eat food");

            }
        }
    }
}
