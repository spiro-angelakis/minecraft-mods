// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelnuman_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer torso;
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public Modelnuman_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -15.0F, 5.0F);
		setRotationAngle(body, -0.48F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 32, 16, -4.0F, 5.0F, -2.0F, 8, 7, 4, 0.0F, false));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.addChild(torso);
		setRotationAngle(torso, 0.829F, 0.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 32, 16, -4.0F, -5.0F, -2.0F, 8, 7, 4, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -15.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, -15.0F, 0.0F);
		headwear.cubeList.add(new ModelBox(headwear, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F, false));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -13.0F, 0.0F);
		right_arm.cubeList.add(new ModelBox(right_arm, 56, 0, -2.0F, -2.0F, -1.0F, 2, 30, 2, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, -13.0F, 0.0F);
		left_arm.cubeList.add(new ModelBox(left_arm, 56, 0, 0.0F, -2.0F, -1.0F, 2, 30, 2, 0.0F, true));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, -6.0F, 0.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 56, 0, -1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, -6.0F, 0.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 56, 0, -1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		headwear.render(f5);
		right_arm.render(f5);
		left_arm.render(f5);
		right_leg.render(f5);
		left_leg.render(f5);
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