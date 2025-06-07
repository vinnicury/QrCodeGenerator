package com.cury.qrcode.generator.ports;

public interface StoragePort {

    String uploadFile(byte[] fileData, String filename, String contentType);

}
