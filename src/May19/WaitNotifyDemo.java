package Day01.src.May19;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Message message = new Message();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    message.produce("消息" + i);
                }
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    message.consume();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
class Message {
    String content;
    boolean hasMessage;
    public synchronized void produce(String message) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.content = message;
        hasMessage = true;
        System.out.println(Thread.currentThread().getName() + " 生产：" + message);
        notify();
    }
        public synchronized void consume() {
            while (!hasMessage) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " 消费：" + content);
            hasMessage = false;
            notify();
        }
    }



