package Ejercicios_Herencia.Ejercicio2;

public enum Formato {

    WAV(".wav"),
    MP3(".mp3"),
    MIDI(".midi"),
    AVI(".avi"),
    MPG(".mpg"),
    CDAUDIO(".cda"),
    DVD(".dvd");

    private String extension;

    Formato(String extension) {
        this.extension = extension;
    }
    public String getExtension() {
        return extension;
    }
}

