// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class venusian extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r8;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r9;

	public venusian() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 9.0F, 9.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -76.0F, -9.0F);
		all.addChild(head);
		head.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 1.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -7.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-7.0F, -2.0F, -7.0F, 14.0F, 1.0F, 13.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-8.0F, -5.0F, -5.0F, 16.0F, 3.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.0F, -7.0F, -7.0F, 18.0F, 2.0F, 14.0F, 0.0F, false);
		head.setTextureOffset(68, 43).addBox(-9.0F, -15.0F, -4.0F, 18.0F, 8.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-10.0F, -15.0F, -8.0F, 1.0F, 8.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(9.0F, -15.0F, -8.0F, 1.0F, 8.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.0F, -16.0F, -8.0F, 18.0F, 1.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -7.0F, 16.0F, 2.0F, 14.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-7.0F, -20.0F, -6.0F, 14.0F, 2.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -7.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -15.0F, -7.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -15.0F, -7.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(2.0F, -15.0F, -7.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -15.0F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(3.0F, -15.0F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(2.0F, -5.0F, -7.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-8.0F, -5.0F, -7.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -7.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, 1.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-6.0F, 1.0F, -6.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(4.0F, 1.0F, -6.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 5.0F, 0.0F);
		head.addChild(jaw);
		setRotationAngle(jaw, 0.4363F, 0.0F, 0.0F);
		jaw.setTextureOffset(0, 24).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		jaw.setTextureOffset(0, 24).addBox(-5.0F, -2.0F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		jaw.setTextureOffset(0, 24).addBox(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		jaw.setTextureOffset(0, 24).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 1.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -53.0F, 0.0F);
		all.addChild(body);
		body.setTextureOffset(80, 0).addBox(-7.0F, -15.0F, -6.0F, 14.0F, 20.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(80, 0).addBox(-2.0F, -15.0F, 4.0F, 3.0F, 28.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(80, 0).addBox(-5.0F, 5.0F, -4.0F, 10.0F, 11.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(80, 0).addBox(-6.0F, 16.0F, -7.0F, 12.0F, 7.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(80, 0).addBox(-3.0F, -27.0F, -4.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-6.0F, -34.0F, 0.0F);
		all.addChild(right_leg);
		right_leg.setTextureOffset(0, 97).addBox(-4.0F, 19.0F, -10.0F, 4.0F, 23.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, -29.0F);
		right_leg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 97).addBox(-4.0F, 42.0F, -23.0F, 4.0F, 3.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -2.0F, -12.0F);
		right_leg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 97).addBox(-4.0F, 42.0F, -21.0F, 4.0F, 3.0F, 14.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_leg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 97).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 23.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(5.0F, -34.0F, 0.0F);
		all.addChild(left_leg);
		left_leg.setTextureOffset(0, 97).addBox(1.0F, 19.0F, -10.0F, 4.0F, 23.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.0F, 0.0F, -29.0F);
		left_leg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 97).addBox(-4.0F, 42.0F, -23.0F, 4.0F, 3.0F, 9.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(5.0F, -2.0F, -12.0F);
		left_leg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 97).addBox(-4.0F, 42.0F, -21.0F, 4.0F, 3.0F, 14.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(5.0F, 0.0F, 0.0F);
		left_leg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 97).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 23.0F, 8.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.0F, -63.0F, 0.0F);
		all.addChild(right_arm);
		right_arm.setTextureOffset(94, 109).addBox(-10.0F, -7.0F, -3.0F, 10.0F, 7.0F, 7.0F, 0.0F, false);
		right_arm.setTextureOffset(94, 109).addBox(-14.0F, -6.0F, -2.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(94, 109).addBox(-14.0F, 0.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(94, 109).addBox(-15.0F, 25.0F, -18.0F, 6.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-10.0F, 20.0F, -4.0F);
		right_arm.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(94, 109).addBox(-4.0F, -6.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(31.0F, -63.0F, 0.0F);
		all.addChild(left_arm);
		left_arm.setTextureOffset(94, 109).addBox(-24.0F, -7.0F, -3.0F, 10.0F, 7.0F, 7.0F, 0.0F, false);
		left_arm.setTextureOffset(94, 109).addBox(-14.0F, -6.0F, -2.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(94, 109).addBox(-14.0F, 0.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(94, 109).addBox(-15.0F, 25.0F, -18.0F, 6.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-10.0F, 20.0F, -4.0F);
		left_arm.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7418F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(94, 109).addBox(-4.0F, -6.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		all.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}