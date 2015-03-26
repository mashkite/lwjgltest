package test.monolith.v1;

import static org.lwjgl.opengl.GL11.*;

public enum Point {
    P_FRONT_TOP_LEFT(-1, 1, 1),
    P_FRONT_TOP_RIGHT(1, 1, 1),
    P_FRONT_BOTTOM_LEFT(-1, -1, 1),
    P_FRONT_BOTTOM_RIGHT(1, -1, 1),
    P_BACK_TOP_LEFT(-1, 1, -1),
    P_BACK_TOP_RIGHT(1, 1, -1),
    P_BACK_BOTTOM_LEFT(-1, -1, -1),
    P_BACK_BOTTOM_RIGHT(1, -1, -1)
    ;

    private final float     x;
    private final float     y;
    private final float     z;

    private Point(float x, float y, float z) {
        this.x = x * 2;
        this.y = y * 4;
        this.z = z;
    }

    public void point() {
        glVertex3f(x, y, z);
    }
}