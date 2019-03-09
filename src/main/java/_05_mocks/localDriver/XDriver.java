package _05_mocks.localDriver;

import _05_mocks.IDriver;
import service.ISizeService;

public class XDriver implements IDriver {

    private ISizeService sizeService;

    public XDriver(ISizeService sizeService) {
        this.sizeService = sizeService;
    }

    public int getWidth() {
        return sizeService.getSize().getX();
    }

    public int getHeight() {
        return sizeService.getSize().getY();
    }
}
