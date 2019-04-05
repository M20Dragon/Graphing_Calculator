import javafx.scene.shape.Line;

import static javafx.scene.paint.Color.BLUE;

/**
 * updated by timurguler on 4/4/2019.
 */
public class lineMaker extends Line
{
    private double xStart = 0;
    private double yStart = 0;
    private double xEnd = 0;
    private double yEnd = 0;
    private double zoom = 0;

    public lineMaker(double xStart, double yStart, double xEnd, double yEnd, double zoom)
    {
        super();
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.zoom = zoom;
        makeLine();
    }
    public void makeLine()
    {
        lineMaker.super.setStartX(xStart);
        lineMaker.super.setStartY(yStart);
        lineMaker.super.setEndX(xEnd);
        lineMaker.super.setEndY(yEnd);
        lineMaker.super.setStroke(BLUE);
        lineMaker.super.setStrokeWidth(2.5);
        //sets the lines in the right area
        lineMaker.super.setRotate(180);
        lineMaker.super.setTranslateX(((xEnd - 250) * -1) * (Math.abs(zoom)));
        lineMaker.super.setTranslateY((yEnd - (yEnd * 2)) * (Math.abs(zoom)/**5*/));
    }

}
