package ru.markush.structual.composite;

import java.io.IOException;

public class ImageFile extends File{
    private final byte[] data;

    public ImageFile(String url) throws IOException {
//        data = new FileInputStream(url).readAllBytes();
        data = new byte[] {1, 2, 3};
    }

    @Override
    public byte[] getData() {
        return data;
    }
}
