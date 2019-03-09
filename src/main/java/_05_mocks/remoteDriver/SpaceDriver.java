package _05_mocks.remoteDriver;

import _05_mocks.IDriver;
import service.ISizeService;

public class SpaceDriver implements IDriver {

    private ISizeService sizeService;

    public int getWidth() {
        return sizeService.getSize().getX();
    }

    public int getHeight() {
        return sizeService.getSize().getY();
    }
}
