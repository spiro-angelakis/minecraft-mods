// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modeltermite_hill_model extends ModelBase {
	private final ModelRenderer hill;

	public Modeltermite_hill_model() {
		textureWidth = 16;
		textureHeight = 16;

		hill = new ModelRenderer(this);
		hill.setRotationPoint(0.0F, 24.0F, 0.0F);
		hill.cubeList.add(new ModelBox(hill, 0, 0, -4.0F, -2.0F, -4.0F, 9, 2, 8, 0.0F, false));
		hill.cubeList.add(new ModelBox(hill, 0, 0, -3.0F, -3.0F, -3.0F, 7, 1, 6, 0.0F, false));
		hill.cubeList.add(new ModelBox(hill, 0, 0, -2.0F, -5.0F, -2.0F, 5, 2, 4, 0.0F, false));
		hill.cubeList.add(new ModelBox(hill, 0, 0, -1.0F, -6.0F, -2.0F, 3, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hill.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}