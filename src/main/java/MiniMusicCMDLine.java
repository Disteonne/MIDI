/*
import  javax.sound.midi.*;

public class MiniMusicCMDLine {
    public static void main(String[] args) {
        MiniMusicCMDLine mini = new MiniMusicCMDLine();
        if (args.length < 2) {
            System.out.println("Не забудьте аргументы для инструмента и ноты!");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent chinst = new MidiEvent(first, 1);
            track.add(chinst);

            ShortMessage a = new ShortMessage();
            a.setMessage(128, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            sequencer.setSequence(seq);
            sequencer.start();
        } catch (Exception ex) {
            System.out.println("Ошибка вопроизведения");
        }
    }
}
 */