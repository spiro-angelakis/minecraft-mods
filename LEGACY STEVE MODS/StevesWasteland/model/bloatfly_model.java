// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class bloatfly_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Eyes;
	private final ModelRenderer Body;
	private final ModelRenderer Chest_r1;
	private final ModelRenderer Thorax;
	private final ModelRenderer thorax_r1;
	private final ModelRenderer Stinger;
	private final ModelRenderer Stinger2_r1;
	private final ModelRenderer Stinger1_r1;
	private final ModelRenderer Belly;
	private final ModelRenderer Belly2_r1;
	private final ModelRenderer Wings;
	private final ModelRenderer Rightwing;
	private final ModelRenderer wingbot_r1;
	private final ModelRenderer wingtop_r1;
	private final ModelRenderer Leftwing;
	private final ModelRenderer wingbot_r2;
	private final ModelRenderer wingtop_r2;

	public bloatfly_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-1.5F, 10.0F, -7.0F);
		

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -0.5F, -1.5F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3054F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(34, 10).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Eyes = new ModelRenderer(this);
		Eyes.setRotationPoint(0.0F, -0.5F, -1.5F);
		Head.addChild(Eyes);
		Eyes.setTextureOffset(0, 16).addBox(-2.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Eyes.setTextureOffset(0, 4).addBox(0.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 7.0F);
		setRotationAngle(Body, 0.48F, 0.0F, 0.0F);
		

		Chest_r1 = new ModelRenderer(this);
		Chest_r1.setRotationPoint(-1.5F, -18.5F, -4.5F);
		Body.addChild(Chest_r1);
		setRotationAngle(Chest_r1, -0.6545F, 0.0F, 0.0F);
		Chest_r1.setTextureOffset(26, 26).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 8.0F, 0.0F, false);

		Thorax = new ModelRenderer(this);
		Thorax.setRotationPoint(-1.5F, -8.0F, -2.0F);
		Body.addChild(Thorax);
		

		thorax_r1 = new ModelRenderer(this);
		thorax_r1.setRotationPoint(0.0F, -0.86F, -8.0063F);
		Thorax.addChild(thorax_r1);
		setRotationAngle(thorax_r1, 1.0036F, 0.0F, 0.0F);
		thorax_r1.setTextureOffset(0, 32).addBox(-2.5F, 4.5F, -1.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		Stinger = new ModelRenderer(this);
		Stinger.setRotationPoint(0.0F, -0.86F, -8.0063F);
		Thorax.addChild(Stinger);
		

		Stinger2_r1 = new ModelRenderer(this);
		Stinger2_r1.setRotationPoint(0.0F, 3.3982F, 2.0899F);
		Stinger.addChild(Stinger2_r1);
		setRotationAngle(Stinger2_r1, -1.4835F, 0.0F, 0.0F);
		Stinger2_r1.setTextureOffset(0, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Stinger1_r1 = new ModelRenderer(this);
		Stinger1_r1.setRotationPoint(1.5F, 8.86F, 10.0063F);
		Stinger.addChild(Stinger1_r1);
		setRotationAngle(Stinger1_r1, -1.0908F, 0.0F, 0.0F);
		Stinger1_r1.setTextureOffset(0, 0).addBox(-2.5F, 2.0F, -9.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Belly = new ModelRenderer(this);
		Belly.setRotationPoint(-1.5F, -13.5F, -1.5F);
		Body.addChild(Belly);
		

		Belly2_r1 = new ModelRenderer(this);
		Belly2_r1.setRotationPoint(0.0F, -0.4037F, 0.8567F);
		Belly.addChild(Belly2_r1);
		setRotationAngle(Belly2_r1, -1.3526F, 0.0F, 0.0F);
		Belly2_r1.setTextureOffset(0, 16).addBox(-3.5F, 0.5F, -4.5F, 7.0F, 6.0F, 10.0F, 0.0F, false);
		Belly2_r1.setTextureOffset(0, 0).addBox(-3.5F, -2.5F, -2.5F, 7.0F, 6.0F, 10.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(-1.5F, 9.5F, -8.5F);
		

		Rightwing = new ModelRenderer(this);
		Rightwing.setRotationPoint(-3.0F, 3.0F, 8.0F);
		Wings.addChild(Rightwing);
		

		wingbot_r1 = new ModelRenderer(this);
		wingbot_r1.setRotationPoint(-4.225F, -0.5699F, 3.7084F);
		Rightwing.addChild(wingbot_r1);
		setRotationAngle(wingbot_r1, -0.6425F, 0.1773F, 0.2443F);
		wingbot_r1.setTextureOffset(19, 21).addBox(-6.5F, 0.0F, -2.5F, 13.0F, 0.0F, 5.0F, 0.0F, false);

		wingtop_r1 = new ModelRenderer(this);
		wingtop_r1.setRotationPoint(-4.0F, -3.0F, 0.5F);
		Rightwing.addChild(wingtop_r1);
		setRotationAngle(wingtop_r1, -0.6313F, 0.0368F, 0.3486F);
		wingtop_r1.setTextureOffset(19, 16).addBox(-6.0F, 0.0F, -2.5F, 13.0F, 0.0F, 5.0F, 0.0F, false);

		Leftwing = new ModelRenderer(this);
		Leftwing.setRotationPoint(3.0F, 3.0F, 8.0F);
		Wings.addChild(Leftwing);
		

		wingbot_r2 = new ModelRenderer(this);
		wingbot_r2.setRotationPoint(6.225F, -0.5699F, 3.7084F);
		Leftwing.addChild(wingbot_r2);
		setRotationAngle(wingbot_r2, -0.6425F, -0.1773F, -0.2443F);
		wingbot_r2.setTextureOffset(19, 5).addBox(-6.5F, 0.0F, -2.5F, 13.0F, 0.0F, 5.0F, 0.0F, false);

		wingtop_r2 = new ModelRenderer(this);
		wingtop_r2.setRotationPoint(6.0F, -3.0F, 0.5F);
		Leftwing.addChild(wingtop_r2);
		setRotationAngle(wingtop_r2, -0.6313F, -0.0368F, -0.3486F);
		wingtop_r2.setTextureOffset(19, 0).addBox(-7.0F, 0.0F, -2.5F, 13.0F, 0.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Wings.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}