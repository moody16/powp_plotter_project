package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand {

    int x;
    int y;


    public CommandDrawLineToPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(IPlotter driver) {
        driver.drawTo(x, y);

    }

}
