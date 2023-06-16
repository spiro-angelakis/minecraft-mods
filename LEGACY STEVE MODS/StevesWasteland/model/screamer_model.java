// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class screamer_model extends EntityModel<Entity> {
	private final ModelRenderer Screamer;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Legs;
	private final ModelRenderer legL;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer legR;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Arms;
	private final ModelRenderer armR;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer armL;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer Head;
	private final ModelRenderer jaw_r1;

	public screamer_model() {
		textureWidth = 128;
		textureHeight = 128;

		Screamer = new ModelRenderer(this);
		Screamer.setRotationPoint(0.0F, 19.0F, -8.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -24.9241F, 6.2365F);
		Screamer.addChild(body);
		setRotationAngle(body, 0.5236F, 0.0F, 0.0F);
		body.setTextureOffset(72, 0).addBox(-2.0F, -18.0F, 1.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 9.2387F, 0.6729F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(40, 13).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.3371F, 3.123F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 40).addBox(-4.0F, -5.0F, -6.0594F, 8.0F, 10.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -5.5759F, -0.2365F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-6.0F, -6.5F, -6.0F, 12.0F, 9.0F, 12.0F, 0.0F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 9.349F, -2.1006F);
		body.addChild(Legs);
		setRotationAngle(Legs, -0.48F, 0.0F, 0.0F);
		

		legL = new ModelRenderer(this);
		legL.setRotationPoint(3.0F, 0.0F, 1.0F);
		Legs.addChild(legL);
		legL.setTextureOffset(34, 44).addBox(0.0F, 19.0F, -5.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.5F, 13.871F, -1.9549F);
		legL.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(12, 59).addBox(-1.5F, -5.0F, -0.5451F, 3.0F, 11.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(34, 68).addBox(-1.5F, -5.0F, -0.5451F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.5F, 3.0F, 0.0F);
		legL.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(34, 54).addBox(-1.5F, -4.0F, -3.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-4.0F, 0.0F, 1.0F);
		Legs.addChild(legR);
		legR.setTextureOffset(36, 0).addBox(-2.0F, 19.0F, -5.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, 3.0F, 0.0F);
		legR.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(52, 50).addBox(-1.5F, -4.0F, -3.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(8.5F, 13.871F, -1.9549F);
		legR.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 59).addBox(-10.5F, -5.0F, -0.5451F, 3.0F, 11.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(64, 10).addBox(-10.5F, -5.0F, -0.5451F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		Arms = new ModelRenderer(this);
		Arms.setRotationPoint(0.0F, -4.0759F, -3.2365F);
		body.addChild(Arms);
		

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-6.0F, -4.0F, -2.0F);
		Arms.addChild(armR);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.6508F, 12.877F, -9.9153F);
		armR.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.9782F, -0.5293F, 0.0036F);
		cube_r8.setTextureOffset(62, 29).addBox(0.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, 5.0F, 0.5F);
		armR.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.9211F, -0.082F, 0.1883F);
		cube_r9.setTextureOffset(48, 64).addBox(-2.0F, -11.0F, -5.5F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, 4.0F, 0.5F);
		armR.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2182F);
		cube_r10.setTextureOffset(66, 44).addBox(-1.5F, -5.0F, -1.5F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		armL = new ModelRenderer(this);
		armL.setRotationPoint(6.0F, -4.0F, -2.0F);
		Arms.addChild(armL);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.0F, 5.0F, 0.5F);
		armL.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.9211F, 0.082F, -0.1883F);
		cube_r11.setTextureOffset(24, 59).addBox(0.0F, -11.0F, -5.5F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.0F, 4.0F, 0.5F);
		armL.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.2182F);
		cube_r12.setTextureOffset(63, 61).addBox(-0.5F, -5.0F, -1.5F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.6508F, 12.877F, -9.9153F);
		armL.addChild(cube_r13);
		setRotationAngle(cube_r13, 1.9782F, 0.5293F, -0.0036F);
		cube_r13.setTextureOffset(58, 0).addBox(-2.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -13.9283F, 0.491F);
		body.addChild(Head);
		setRotationAngle(Head, -0.5585F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 21).addBox(-5.0F, -12.0F, -10.0F, 10.0F, 8.0F, 11.0F, 0.0F, false);

		jaw_r1 = new ModelRenderer(this);
		jaw_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
		Head.addChild(jaw_r1);
		setRotationAngle(jaw_r1, 0.2182F, 0.0F, 0.0F);
		jaw_r1.setTextureOffset(32, 30).addBox(-5.0F, -2.5F, -9.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Screamer.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}