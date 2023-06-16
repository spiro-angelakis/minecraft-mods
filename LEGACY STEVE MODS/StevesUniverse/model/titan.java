// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class titan extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer torso;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer head;
	private final ModelRenderer cube_r15;

	public titan() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -37.0F, 0.0F);
		

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, -30.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(0, 149).addBox(-18.0F, 2.0F, -32.0F, 36.0F, 28.0F, 30.0F, 0.0F, false);
		torso.setTextureOffset(0, 178).addBox(-16.0F, 0.0F, -34.0F, 32.0F, 30.0F, 30.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 17.0F, 24.0F);
		torso.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(94, 192).addBox(-12.0F, -11.0F, 16.0F, 24.0F, 22.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(51, 149).addBox(-14.0F, -11.0F, 10.0F, 28.0F, 24.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(47, 193).addBox(-16.0F, -11.0F, -20.0F, 32.0F, 26.0F, 30.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 17.0F, -5.0F);
		torso.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 208).addBox(-14.0F, -11.0F, -13.0F, 28.0F, 22.0F, 26.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-18.0F, -25.0F, -18.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(25, 83).addBox(-8.0F, 81.0F, -0.8774F, 12.0F, 4.0F, 14.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.0F, 18.6813F, 6.1226F);
		right_arm.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(66, 119).addBox(-7.0F, 14.3187F, 3.0F, 2.0F, 22.0F, 10.0F, 0.0F, false);
		cube_r3.setTextureOffset(105, 109).addBox(-3.0F, 38.3187F, 3.0F, 8.0F, 24.0F, 10.0F, 0.0F, false);
		cube_r3.setTextureOffset(60, 101).addBox(-5.0F, 16.3187F, 1.0F, 12.0F, 22.0F, 14.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(18.0F, 25.0F, 18.0F);
		right_arm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(86, 72).addBox(-30.0F, -36.0F, -16.0F, 16.0F, 26.0F, 14.0F, 0.0F, false);
		cube_r4.setTextureOffset(54, 119).addBox(-28.0F, -14.0F, -14.0F, 2.0F, 24.0F, 10.0F, 0.0F, false);
		cube_r4.setTextureOffset(34, 94).addBox(-26.0F, -14.0F, -16.0F, 12.0F, 26.0F, 14.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 83).addBox(-28.0F, -34.0F, -18.0F, 16.0F, 26.0F, 18.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(18.0F, -28.0F, -18.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(135, 11).addBox(-4.0F, 84.0F, -0.8774F, 12.0F, 4.0F, 14.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.0F, 21.6813F, 6.1226F);
		left_arm.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(176, 47).addBox(5.0F, 14.3187F, 3.0F, 2.0F, 22.0F, 10.0F, 0.0F, true);
		cube_r5.setTextureOffset(215, 37).addBox(-5.0F, 38.3187F, 3.0F, 8.0F, 24.0F, 10.0F, 0.0F, true);
		cube_r5.setTextureOffset(170, 29).addBox(-7.0F, 16.3187F, 1.0F, 12.0F, 22.0F, 14.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-18.0F, 28.0F, 18.0F);
		left_arm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(196, 0).addBox(14.0F, -36.0F, -16.0F, 16.0F, 26.0F, 14.0F, 0.0F, true);
		cube_r6.setTextureOffset(164, 47).addBox(26.0F, -14.0F, -14.0F, 2.0F, 24.0F, 10.0F, 0.0F, true);
		cube_r6.setTextureOffset(144, 22).addBox(14.0F, -14.0F, -16.0F, 12.0F, 26.0F, 14.0F, 0.0F, true);
		cube_r6.setTextureOffset(110, 11).addBox(12.0F, -34.0F, -18.0F, 16.0F, 26.0F, 18.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-16.0F, -24.0F, 24.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(191, 51).addBox(-4.0F, 75.7234F, -8.5287F, 8.0F, 8.0F, 12.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 76.7234F, -2.5287F);
		right_leg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(151, 51).addBox(-4.0F, -17.0F, 6.0F, 8.0F, 26.0F, 6.0F, 0.0F, false);
		cube_r7.setTextureOffset(220, 0).addBox(-4.0F, -15.0F, 2.0F, 8.0F, 22.0F, 10.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(16.0F, 24.0F, -20.0F);
		right_leg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(111, 42).addBox(-20.0F, 22.0F, 16.0F, 8.0F, 32.0F, 12.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(16.0F, 24.0F, -20.0F);
		right_leg.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(197, 29).addBox(-20.0F, 6.0F, 4.0F, 8.0F, 28.0F, 16.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(16.0F, 24.0F, -20.0F);
		right_leg.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(165, 9).addBox(-22.0F, -34.0F, 6.0F, 12.0F, 38.0F, 20.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(16.0F, -23.0F, 24.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(191, 51).addBox(-4.0F, 74.7234F, -8.5287F, 8.0F, 8.0F, 12.0F, 0.0F, true);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 75.7234F, -2.5287F);
		left_leg.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(151, 51).addBox(-4.0F, -17.0F, 6.0F, 8.0F, 26.0F, 6.0F, 0.0F, true);
		cube_r11.setTextureOffset(220, 0).addBox(-4.0F, -15.0F, 2.0F, 8.0F, 22.0F, 10.0F, 0.0F, true);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-16.0F, 23.0F, -20.0F);
		left_leg.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(111, 42).addBox(12.0F, 22.0F, 16.0F, 8.0F, 32.0F, 12.0F, 0.0F, true);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-16.0F, 23.0F, -20.0F);
		left_leg.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(197, 29).addBox(12.0F, 6.0F, 4.0F, 8.0F, 28.0F, 16.0F, 0.0F, true);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-16.0F, 23.0F, -20.0F);
		left_leg.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(165, 9).addBox(10.0F, -34.0F, 6.0F, 12.0F, 38.0F, 20.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -24.0556F, -29.3429F);
		body.addChild(head);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 15.0F, 13.0F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(50, 67).addBox(-12.0F, -17.0F, -40.0F, 24.0F, 6.0F, 10.0F, 0.0F, false);
		cube_r15.setTextureOffset(58, 73).addBox(-6.0F, -15.0F, -42.0F, 12.0F, 6.0F, 12.0F, 0.0F, false);
		cube_r15.setTextureOffset(57, 25).addBox(-8.0F, -9.0F, -40.0F, 16.0F, 2.0F, 10.0F, 0.0F, false);
		cube_r15.setTextureOffset(64, 61).addBox(-10.0F, -11.0F, -40.0F, 20.0F, 2.0F, 10.0F, 0.0F, false);
		cube_r15.setTextureOffset(0, 76).addBox(-4.0F, -15.0F, -42.0F, 8.0F, 24.0F, 12.0F, 0.0F, false);
		cube_r15.setTextureOffset(0, 0).addBox(-6.0F, -17.0F, -40.0F, 12.0F, 28.0F, 10.0F, 0.0F, false);
		cube_r15.setTextureOffset(0, 0).addBox(-14.0F, -19.0F, -38.0F, 28.0F, 26.0F, 2.0F, 0.0F, false);
		cube_r15.setTextureOffset(60, 0).addBox(-12.0F, 5.0F, -38.0F, 24.0F, 8.0F, 10.0F, 0.0F, false);
		cube_r15.setTextureOffset(0, 0).addBox(-16.0F, -21.0F, -36.0F, 32.0F, 28.0F, 22.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}