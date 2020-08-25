/*import  javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini= new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){
        try {
            //получаем синтезатор и открываем его для дальнейшего использования
            Sequencer player =MidiSystem.getSequencer();
            player.open();

            //задаем последовательность
            Sequence seq= new Sequence(Sequence.PPQ,4);

            //запрашиваем трек у последовательности
            //трек-внутри послед.,а midi данные-в треке
            Track track= seq.createTrack();
 */
/*
            //помещаем в трек midi-события
            ShortMessage a= new ShortMessage();
            a.setMessage(144,1,50,100);
            /*
            *   144-означает начало проигрывания ноты,128-конец проигрывания
            *   channel-канал (в зависимости от инструмента). 1- клавишник,9-ударник и тд
            *   44-номер ноты (от 0 до 127)
            *   data2-скорость/сила нажатия. 100- стандартное значение.
             */
/*
            MidiEvent noteOn= new MidiEvent(a,1); //1й такт (1 бит)
            track.add(noteOn);//noteOn-событие "начинает играть"

            ShortMessage b= new ShortMessage();
            b.setMessage(128,1,44,100); //что делать
            MidiEvent noteOff= new MidiEvent(b,16);//когда делать
            track.add(noteOff);//noteOff-событие "перестает играть"

            //передаем последовательность синтезатору
            player.setSequence(seq);
            player.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
*/