import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MusicPlayer2 implements  ControllerEventListener{
    static JFrame frame=new JFrame("Первый музыкальный  клип");
    static MyDrawPanel pl;

    public static void main(String[] args) {
        MusicPlayer2 musicPlayer2=new MusicPlayer2();
        musicPlayer2.go();
    }
    public void setUpGui(){
        pl=new MyDrawPanel();
        frame.setContentPane(pl);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);
    }

    public  void go(){
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            int[] eventsIwant = {127}; //127е событие
            sequencer.addControllerEventListener(this, eventsIwant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);//создаем последовательность
            Track track = seq.createTrack();
            int r=0;
            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
                sequencer.setSequence(seq);
                sequencer.setTempoInBPM(120);
                sequencer.start();
            }
        }catch (Exception ex){
                ex.printStackTrace();
            }
    }
        public void controlChange(ShortMessage event){
        System.out.println("Воу");
        }

    public static MidiEvent makeEvent(int comd,int chan,int one,int two,int tick){
        MidiEvent event=null;
        try {
            ShortMessage shortMessage=new ShortMessage();
            shortMessage.setMessage(comd,chan,one,two);
            event =new MidiEvent(shortMessage,tick);
        }catch (Exception e){
            System.out.println("Ошибка");
        }
        return event;
    }
    class MyDrawPanel extends JPanel implements ControllerEventListener{
        boolean msg=false;

        public void controlChange(ShortMessage event){
            msg=true;
            repaint();
        }
        public void paintComp(Graphics g){
            if(msg){
                Graphics2D g2= (Graphics2D) g;
                int red=(int) (Math.random()*250);
                int green=(int) (Math.random()*250);
                int blue=(int) (Math.random()*250);
                Color color=new Color(red,green,blue);
                g.setColor(color);

                int height =(int) ((Math.random()*120)+10);
                int weight=(int) ((Math.random()*120)+10);
                int x=(int) ((Math.random()*40)+10);
                int y=(int) ((Math.random()*40)+10);
                g.fillRect(x,y,height,weight);
                msg=false;
            }

        }
    }
}
