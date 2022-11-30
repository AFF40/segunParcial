package com.example.recovery.model;

public class Image {
    private String urlImage;
    private String username;
       private String cantidadDias;
    private String cantidadMegusta;

    public Image(String urlImage, String username, String cantidadDias, String cantidadMegusta) {
        this.setUrlImage(urlImage);
        this.setUsername(username);
        this.setCantidadDias(cantidadDias);
        this.setCantidadMegusta(cantidadMegusta);
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getCantidadMegusta() {
        return cantidadMegusta;
    }

    public void setCantidadMegusta(String cantidadMegusta) {
        this.cantidadMegusta = cantidadMegusta;
    }
}
