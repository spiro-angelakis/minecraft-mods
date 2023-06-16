// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelwalker_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;

	public Modelwalker_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(head, 0.3927F, 0.0F, 0.0873F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -1.0F, -5.0F, 8, 2, 8, 0.0F, false));

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 1.0F, 2.0F);
		head.addChild(headwear);
		setRotationAngle(headwear, -0.1309F, 0.0F, 0.0F);
		headwear.cubeList.add(new ModelBox(headwear, 32, 0, -4.0F, -10.0F, -7.0F, 8, 8, 8, 0.25F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.48F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -1.0F, 8, 6, 4, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(left_arm, -0.0873F, 0.0F, -0.0873F);
		left_arm.cubeList.add(new ModelBox(left_arm, 40, 16, 9.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(right_arm, -0.0873F, 0.0F, 0.0873F);
		right_arm.cubeList.add(new ModelBox(right_arm, 40, 16, -13.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(left_leg, 0.0F, 0.0F, -0.0436F);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 16, 1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(right_leg, 0.0F, 0.0F, 0.0436F);
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 16, -5.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-1.0F, 1.0F, 2.0F);
		setRotationAngle(body2, 0.1745F, 0.0F, 0.0F);
		body2.cubeList.add(new ModelBox(body2, 16, 16, -2.0F, 3.0F, -1.0F, 6, 3, 4, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(-1.0F, 6.0F, 2.8F);
		setRotationAngle(body3, -0.3491F, 0.0F, 0.0F);
		body3.cubeList.add(new ModelBox(body3, 16, 16, -2.0F, -1.0F, -1.0F, 6, 7, 4, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(-3.0F, 7.0F, 0.7F);
		setRotationAngle(body4, -0.0873F, 0.0F, 0.0F);
		body4.cubeList.add(new ModelBox(body4, 16, 16, -1.0F, 2.0F, -2.0F, 8, 4, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		left_arm.render(f5);
		right_arm.render(f5);
		left_leg.render(f5);
		right_leg.render(f5);
		body2.render(f5);
		body3.render(f5);
		body4.render(f5);
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
		this.headwear.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.headwear.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}