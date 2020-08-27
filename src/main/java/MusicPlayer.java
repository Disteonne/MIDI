/*
import javax.sound.midi.*;
public class MusicPlayer {
    public static void main(String[] args) {
        try {
            Sequencer sequencer=MidiSystem.getSequencer();//созд синтезатор
            sequencer.open();

            Sequence seq= new Sequence(Sequence.PPQ,4);//создаем последовательность
            Track track= seq.createTrack();
            for(int i=5;i<61;i++){
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(128,1,i,100,i+2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
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
}

*/