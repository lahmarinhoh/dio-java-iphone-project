package model;

import interfaces.AppManager;
import interfaces.Camera;
import interfaces.MediaPlayer;
import interfaces.Telephone;
import interfaces.WebBrowser;

public class Iphone implements MediaPlayer, Telephone, WebBrowser, AppManager, Camera {

    private String mark;
    private String version;
    private Long serialNumber;
    
    public Iphone(String mark, String version, Long serialNumber) {
        this.mark = mark;
        this.version = version;
        this.serialNumber = serialNumber;
    }

    public Iphone() {}

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Iphone [mark=" + mark + ", version=" + version + ", serialNumber=" + serialNumber + "]";
    }

    public void turnOn() {
        System.out.println("O Iphone está inicializando.");
    }

    public void turnOff() {
        System.out.println("O Iphone está desligando.");
    }

    public void restart() {
        System.out.println("O Iphone está reiniciando.");
    }

    @Override
    public void videoPlayer() {
        System.out.println("Reproduzindo video.");
    }

    @Override
    public void musicPlayer() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void call() {
        System.out.println("Realizando uma ligação.");
    }

    @Override
    public void sendTextMessage() {
        System.out.println("Enviando uma mensagem de texto.");
    }

    @Override
    public void acceptCall() {
        System.out.println("Aceitando chamada.");
    }

    @Override
    public void rejectCall() {
        System.out.println("Rejeitando chamada.");
    }

    @Override
    public void putCallOnWait() {
        System.out.println("Colocando chamada em espera.");
    }

    @Override
    public void navigate() {
        System.out.println("Abrindo o navegador.");
    }

    @Override
    public void installApp() {
        System.out.println("Instalando aplicação.");
    }

    @Override
    public void removeApp() {
        System.out.println("Removendo aplicação.");
    }

    @Override
    public void updateApp() {
        System.out.println("Atualizando aplicação.");
    }

    @Override
    public void openApp() {
        System.out.println("Abrindo aplicação.");
    }

    @Override
    public void closeApp() {
        System.out.println("Fechando aplicação.");
    }

    @Override
    public void record() {
        System.out.println("Realizando gravação.");
    }

    @Override
    public void takePicture() {
        System.out.println("Registrando foto.");
    }

    @Override
    public void openGallery() {
        System.out.println("Abrindo galeria.");
    }

}
