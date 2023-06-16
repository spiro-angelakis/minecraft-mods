// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelpoop_daddy extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public Modelpoop_daddy() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.0F, 4.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -6.0F, -3.0F, 7, 7, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 112, 56, -2.5F, -5.0F, -6.0F, 5, 5, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 0, -1.5F, -8.0F, 0.0F, 2, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 0, -1.5F, -7.0F, -1.0F, 3, 1, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, 9.0F, 12.0F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(-2.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(body_sub_1);
		body_sub_1.cubeList.add(new ModelBox(body_sub_1, 0, 19, -12.0F, -13.0F, -12.0F, 23, 16, 16, 0.0F, false));
		body_sub_1.cubeList.add(new ModelBox(body_sub_1, 39, 0, -6.0F, -12.0F, 4.0F, 12, 12, 10, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(11.5F, 12.0F, 6.0F);
		leg1.cubeList.add(new ModelBox(leg1, 23, 30, -1.0F, 0.0F, -2.0F, 8, 10, 8, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-11.5F, 12.0F, 6.0F);
		leg2.cubeList.add(new ModelBox(leg2, 17, 35, -8.0F, 0.0F, -2.0F, 8, 10, 8, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.5F, -6.0F, 5.0F);
		leg3.cubeList.add(new ModelBox(leg3, 50, 40, 1.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-5.5F, -6.0F, 4.0F);
		leg4.cubeList.add(new ModelBox(leg4, 50, 40, -4.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
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
		this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}