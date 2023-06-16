// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class brahmin4_model extends EntityModel<Entity> {
	private final ModelRenderer Brahmin;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Heads;
	private final ModelRenderer Head1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Head2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer Legs;
	private final ModelRenderer backright;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer backleft;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer frontright;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer frontleft;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public brahmin4_model() {
		textureWidth = 256;
		textureHeight = 256;

		Brahmin = new ModelRenderer(this);
		Brahmin.setRotationPoint(-2.3F, 10.0F, -4.0F);
		

		Body = new ModelRenderer(this);
		Body.setRotationPoint(1.0F, 1.0F, 11.0F);
		Brahmin.addChild(Body);
		Body.setTextureOffset(59, 0).addBox(-6.0F, -15.0F, -23.0F, 15.0F, 2.0F, 19.0F, 0.0F, false);
		Body.setTextureOffset(58, 37).addBox(-6.0F, -13.0F, -23.0F, 15.0F, 2.0F, 22.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-6.0F, -11.0F, -23.0F, 15.0F, 8.0F, 29.0F, 0.0F, false);
		Body.setTextureOffset(59, 21).addBox(-6.0F, -11.0F, -25.0F, 15.0F, 6.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 37).addBox(-6.0F, -3.0F, -22.0F, 15.0F, 2.0F, 28.0F, 0.0F, false);
		Body.setTextureOffset(0, 67).addBox(-4.0F, -1.0F, -6.0F, 11.0F, 5.0F, 11.0F, 0.0F, false);
		Body.setTextureOffset(33, 67).addBox(-3.0F, 4.0F, -5.0F, 9.0F, 2.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.6019F, 7.8527F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(24, 7).addBox(-0.5F, -1.75F, -0.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-1.5F, -1.75F, -0.3F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, -5.5F, 6.5F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(98, 95).addBox(-1.0F, -5.5F, -0.5F, 2.0F, 11.0F, 1.0F, 0.0F, false);

		Heads = new ModelRenderer(this);
		Heads.setRotationPoint(0.0F, -10.0F, -23.0F);
		Body.addChild(Heads);
		

		Head1 = new ModelRenderer(this);
		Head1.setRotationPoint(7.0F, -3.0833F, -0.25F);
		Heads.addChild(Head1);
		Head1.setTextureOffset(37, 78).addBox(-4.0F, -2.9167F, -6.75F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		Head1.setTextureOffset(0, 57).addBox(-4.0F, 0.0833F, -8.75F, 8.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1393F, 0.4149F, -0.3348F);
		cube_r3.setTextureOffset(8, 27).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4272F, 0.0916F, -1.3725F);
		cube_r4.setTextureOffset(0, 27).addBox(0.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4272F, -0.0916F, 1.3725F);
		cube_r5.setTextureOffset(0, 37).addBox(-3.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head1.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1393F, -0.4149F, 0.3348F);
		cube_r6.setTextureOffset(0, 39).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(-5.0F, -1.0833F, -0.25F);
		Heads.addChild(Head2);
		Head2.setTextureOffset(69, 67).addBox(-4.0F, -2.9167F, -6.75F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		Head2.setTextureOffset(0, 20).addBox(-4.0F, 0.0833F, -8.75F, 8.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1393F, 0.4149F, -0.3348F);
		cube_r7.setTextureOffset(0, 4).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4272F, 0.0916F, -1.3725F);
		cube_r8.setTextureOffset(0, 6).addBox(0.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4272F, -0.0916F, 1.3725F);
		cube_r9.setTextureOffset(18, 20).addBox(-3.5F, 0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.5F, -1.4167F, -3.25F);
		Head2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1393F, -0.4149F, 0.3348F);
		cube_r10.setTextureOffset(20, 22).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Legs);
		

		backright = new ModelRenderer(this);
		backright.setRotationPoint(-6.0F, -4.0F, 0.0F);
		Legs.addChild(backright);
		backright.setTextureOffset(67, 82).addBox(-4.0F, -5.0F, -4.0F, 4.0F, 9.0F, 7.0F, 0.0F, false);
		backright.setTextureOffset(60, 79).addBox(-3.5F, 13.9952F, 0.8586F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		backright.setTextureOffset(51, 93).addBox(-3.5F, 14.9952F, -1.1414F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, 16.4952F, 0.3586F);
		backright.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.9163F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(0, 74).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.0F, 11.4952F, 5.8586F);
		backright.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(99, 71).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.5F, 6.5802F, 2.4171F);
		backright.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(56, 93).addBox(-1.5F, -4.5F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, false);
		cube_r13.setTextureOffset(89, 82).addBox(-1.5F, -4.5F, -2.5F, 3.0F, 9.0F, 4.0F, 0.0F, false);

		backleft = new ModelRenderer(this);
		backleft.setRotationPoint(9.4286F, -4.0F, 1.5384F);
		Legs.addChild(backleft);
		backleft.setTextureOffset(58, 37).addBox(-0.4286F, -5.0F, -5.5384F, 4.0F, 9.0F, 7.0F, 0.0F, false);
		backleft.setTextureOffset(14, 83).addBox(1.0714F, 14.9952F, -2.6798F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		backleft.setTextureOffset(70, 53).addBox(1.0714F, 13.9952F, -0.6798F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.5714F, 16.4952F, -1.1798F);
		backleft.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.9163F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(17, 61).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.5714F, 11.4952F, 4.3202F);
		backleft.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(0, 67).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.0714F, 6.5802F, 0.8787F);
		backleft.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(59, 0).addBox(-1.5F, -4.5F, -2.5F, 3.0F, 9.0F, 4.0F, 0.0F, false);
		cube_r16.setTextureOffset(40, 93).addBox(-1.5F, -4.5F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		frontright = new ModelRenderer(this);
		frontright.setRotationPoint(-6.0F, -7.0F, -16.0F);
		Legs.addChild(frontright);
		frontright.setTextureOffset(60, 67).addBox(-3.0F, 17.9952F, -4.1414F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		frontright.setTextureOffset(59, 13).addBox(-3.0F, 16.9952F, -2.1414F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0F, 2.0F, 0.0F);
		frontright.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.48F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(20, 87).addBox(-3.0F, -4.0F, -3.0F, 4.0F, 11.0F, 6.0F, 0.0F, false);
		cube_r17.setTextureOffset(0, 37).addBox(-2.0F, -5.0F, -4.0F, 4.0F, 12.0F, 8.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.0F, 19.4952F, -2.6414F);
		frontright.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.9163F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(70, 61).addBox(-1.0F, -1.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, 14.8236F, -0.8977F);
		frontright.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(16, 37).addBox(-1.0F, -4.5F, -1.3023F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.0F, 14.8236F, -0.8977F);
		frontright.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(72, 98).addBox(-1.0F, -1.5F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, 2.0F, 0.0F);
		frontright.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(92, 61).addBox(-2.0F, 3.0F, 1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		frontleft = new ModelRenderer(this);
		frontleft.setRotationPoint(8.0F, -6.0F, -15.0F);
		Legs.addChild(frontleft);
		frontleft.setTextureOffset(17, 24).addBox(0.0F, 16.9952F, -5.1414F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		frontleft.setTextureOffset(58, 53).addBox(0.0F, 15.9952F, -3.1414F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.0F, 1.0F, -1.0F);
		frontleft.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.48F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(0, 83).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 11.0F, 6.0F, 0.0F, false);
		cube_r22.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -4.0F, 4.0F, 12.0F, 8.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.0F, 18.4952F, -3.6414F);
		frontleft.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.9163F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(58, 61).addBox(-2.0F, -1.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(2.0F, 13.8236F, -1.8977F);
		frontleft.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.3491F, 0.0F, 0.0F);
		cube_r24.setTextureOffset(16, 0).addBox(-2.0F, -4.5F, -1.3023F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.0F, 13.8236F, -1.8977F);
		frontleft.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
		cube_r25.setTextureOffset(86, 95).addBox(-2.0F, -1.5F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(2.0F, 1.0F, -1.0F);
		frontleft.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.3054F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(89, 25).addBox(-2.0F, 3.0F, 1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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