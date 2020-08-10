package com.cazsius.solcarrot.client.gui.elements;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.AbstractGui;

import java.awt.*;

public class UIBox extends UIElement {
	public static UIBox horizontalLine(int minX, int maxX, int y, Color color) {
		return new UIBox(new Rectangle(minX, y, maxX + 1 - minX, 1), color);
	}
	
	public static UIBox verticalLine(int x, int minY, int maxY, Color color) {
		return new UIBox(new Rectangle(x, minY, 1, maxY + 1 - minY), color);
	}
	
	public Color color;
	
	public UIBox(Rectangle frame, Color color) {
		super(frame);
		
		this.color = color;
	}
	
	@Override
	protected void render(MatrixStack matrices) {
		super.render(matrices);
		
		AbstractGui.fill(matrices, frame.x, frame.y, frame.x + frame.width, frame.y + frame.height, color.getRGB());
	}
}
