package main.java.org.example.structuralPatterns.Adapter;

public class AdapterApp {
    public static void main(String[] args) {
        // наследование
        VectorAdapterFromRaster adapter = new VectorAdapterFromRaster();
        adapter.draw();
        // композиция
        VectorAdapterFromRaster2 adapter1 = new VectorAdapterFromRaster2();
        adapter1.draw();
    }
}

// наследование
interface VectorGraphics {
    void draw();
    void drawSquare();
}

class RasterGraphics {
    public void drawRasterLine() {
        System.out.println("draw line");
    }
    public void drawRasterSquare() {
        System.out.println("draw square");
    }
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphics {

    @Override
    public void draw() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

// композиция

class VectorAdapterFromRaster2 implements VectorGraphics {
    RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void draw() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}