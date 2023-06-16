// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelflying_trud extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer right_wing;
	private final ModelRenderer outer_right_wing;
	private final ModelRenderer left_wing;
	private final ModelRenderer outer_left_wing;

	public Modelflying_trud() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0F, 0.0F);
		setRotationAngle(body, 1.2654F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -3.0F, -4.0F, -3.0F, 6, 12, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 34, -2.0F, 8.0F, 0.0F, 4, 3, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.0F, 0.0F);
		body.addChild(head);
		setRotationAngle(head, -0.2618F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F, false));

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-2.0F, -1.0F, 0.0F);
		body.addChild(right_wing);
		right_wing.cubeList.add(new ModelBox(right_wing, 42, 0, -8.0F, -2.0F, 1.5F, 8, 6, 1, 0.0F, false));

		outer_right_wing = new ModelRenderer(this);
		outer_right_wing.setRotationPoint(-8.0F, 0.0F, 1.5F);
		right_wing.addChild(outer_right_wing);
		outer_right_wing.cubeList.add(new ModelBox(outer_right_wing, 54, 11, -4.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, false));

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(3.0F, 0.0F, 0.0F);
		body.addChild(left_wing);
		left_wing.cubeList.add(new ModelBox(left_wing, 42, 0, -1.0F, -3.0F, 1.5F, 8, 6, 1, 0.0F, true));

		outer_left_wing = new ModelRenderer(this);
		outer_left_wing.setRotationPoint(7.0F, -2.0F, 1.5F);
		left_wing.addChild(outer_left_wing);
		outer_left_wing.cubeList.add(new ModelBox(outer_left_wing, 54, 12, 0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_wing.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}