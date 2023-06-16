// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class martian extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r8;

	public martian() {
		textureWidth = 256;
		textureHeight = 256;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -112.0F, -3.0F);
		all.addChild(head);
		head.setTextureOffset(0, 0).addBox(-9.0F, -6.0F, -9.0F, 18.0F, 6.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, 4.0F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-7.0F, 1.0F, -5.0F, 14.0F, 2.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-12.0F, -26.0F, -12.0F, 24.0F, 20.0F, 21.0F, 0.0F, false);
		head.setTextureOffset(236, 0).addBox(-10.0F, -22.0F, -13.0F, 9.0F, 12.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(236, 0).addBox(1.0F, -22.0F, -13.0F, 9.0F, 12.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -93.0F, 3.0F);
		all.addChild(body);
		body.setTextureOffset(0, 93).addBox(-13.0F, -5.0F, -12.0F, 26.0F, 21.0F, 17.0F, 0.0F, false);
		body.setTextureOffset(81, 95).addBox(-10.0F, 16.0F, -7.0F, 20.0F, 21.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(0, 93).addBox(-9.0F, 16.0F, -11.0F, 18.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 93).addBox(-4.0F, -29.0F, 0.0F, 8.0F, 24.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 93).addBox(-5.0F, -12.0F, -5.0F, 10.0F, 7.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 93).addBox(-10.0F, -8.0F, -10.0F, 20.0F, 3.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-7.0F, -56.0F, 3.0F);
		all.addChild(right_leg);
		right_leg.setTextureOffset(0, 229).addBox(-4.0F, 0.0F, -8.0F, 10.0F, 11.0F, 16.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 229).addBox(-4.0F, 11.0F, -8.0F, 10.0F, 16.0F, 11.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 53.0F, 9.0F);
		right_leg.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.2217F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 229).addBox(-2.0F, -1.0F, -4.0F, 6.0F, 16.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 33.0F, 9.0F);
		right_leg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 229).addBox(-2.0F, -1.0F, -8.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 23.0F, -4.0F);
		right_leg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9599F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 229).addBox(-4.0F, -1.0F, -8.0F, 10.0F, 16.0F, 6.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(5.0F, -56.0F, 3.0F);
		all.addChild(left_leg);
		left_leg.setTextureOffset(0, 229).addBox(-4.0F, 0.0F, -8.0F, 10.0F, 11.0F, 16.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 229).addBox(-4.0F, 11.0F, -8.0F, 10.0F, 16.0F, 11.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 53.0F, 9.0F);
		left_leg.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.2217F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 229).addBox(-2.0F, -1.0F, -4.0F, 6.0F, 16.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 33.0F, 9.0F);
		left_leg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 229).addBox(-2.0F, -1.0F, -8.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 23.0F, -4.0F);
		left_leg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.9599F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 229).addBox(-4.0F, -1.0F, -8.0F, 10.0F, 16.0F, 6.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-13.0F, -93.0F, 8.0F);
		all.addChild(right_arm);
		right_arm.setTextureOffset(208, 223).addBox(-13.0F, -7.0F, -8.0F, 13.0F, 11.0F, 11.0F, 0.0F, false);
		right_arm.setTextureOffset(208, 223).addBox(-13.0F, 4.0F, -10.0F, 8.0F, 18.0F, 15.0F, 0.0F, false);
		right_arm.setTextureOffset(208, 223).addBox(-12.0F, 22.0F, -4.0F, 6.0F, 12.0F, 7.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 37.0F, -4.0F);
		right_arm.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(208, 223).addBox(-11.0F, -7.0F, -2.0F, 4.0F, 22.0F, 5.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(11.0F, -93.0F, 8.0F);
		all.addChild(left_arm);
		left_arm.setTextureOffset(208, 223).addBox(2.0F, -7.0F, -8.0F, 13.0F, 11.0F, 11.0F, 0.0F, false);
		left_arm.setTextureOffset(208, 223).addBox(7.0F, 4.0F, -10.0F, 8.0F, 18.0F, 15.0F, 0.0F, false);
		left_arm.setTextureOffset(208, 223).addBox(8.0F, 22.0F, -4.0F, 6.0F, 12.0F, 7.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(21.0F, 37.0F, -4.0F);
		left_arm.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(208, 223).addBox(-12.0F, -7.0F, -2.0F, 4.0F, 22.0F, 5.0F, 0.0F, false);
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