// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class brahmin4_baby extends EntityModel<Entity> {
	private final ModelRenderer Brahmin;
	private final ModelRenderer body;
	private final ModelRenderer Heads;
	private final ModelRenderer Head1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Head2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_left_leg;

	public brahmin4_baby() {
		textureWidth = 256;
		textureHeight = 256;

		Brahmin = new ModelRenderer(this);
		Brahmin.setRotationPoint(-2.3F, 10.0F, -4.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Brahmin.addChild(body);
		body.setTextureOffset(0, 0).addBox(-6.0F, 3.0F, -2.0F, 16.0F, 7.0F, 15.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, 3.0F, 13.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Heads = new ModelRenderer(this);
		Heads.setRotationPoint(1.0F, 6.0F, -2.0F);
		body.addChild(Heads);
		

		Head1 = new ModelRenderer(this);
		Head1.setRotationPoint(7.0F, -3.0833F, -0.25F);
		Heads.addChild(Head1);
		Head1.setTextureOffset(37, 78).addBox(-4.0F, -2.9167F, -6.75F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		Head1.setTextureOffset(0, 57).addBox(-4.0F, 0.0833F, -8.75F, 8.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1393F, 0.4149F, -0.3348F);
		cube_r1.setTextureOffset(8, 27).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4272F, 0.0916F, -1.3725F);
		cube_r2.setTextureOffset(0, 27).addBox(0.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4272F, -0.0916F, 1.3725F);
		cube_r3.setTextureOffset(0, 37).addBox(-3.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1393F, -0.4149F, 0.3348F);
		cube_r4.setTextureOffset(0, 39).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(-5.0F, -1.0833F, -0.25F);
		Heads.addChild(Head2);
		Head2.setTextureOffset(69, 67).addBox(-4.0F, -2.9167F, -6.75F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		Head2.setTextureOffset(0, 20).addBox(-4.0F, 0.0833F, -8.75F, 8.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1393F, 0.4149F, -0.3348F);
		cube_r5.setTextureOffset(0, 4).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4272F, 0.0916F, -1.3725F);
		cube_r6.setTextureOffset(0, 6).addBox(0.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4272F, -0.0916F, 1.3725F);
		cube_r7.setTextureOffset(18, 20).addBox(-3.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1393F, -0.4149F, 0.3348F);
		cube_r8.setTextureOffset(20, 22).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-6.0F, 7.0F, 1.0F);
		body.addChild(front_right_leg);
		front_right_leg.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 8.0F, 4.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(10.0F, 7.0F, 0.0F);
		body.addChild(front_left_leg);
		front_left_leg.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -1.0F, 2.0F, 8.0F, 4.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(-6.0F, 7.0F, 10.0F);
		body.addChild(back_right_leg);
		back_right_leg.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(10.0F, 6.0F, 10.0F);
		body.addChild(back_left_leg);
		back_left_leg.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -3.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Brahmin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}