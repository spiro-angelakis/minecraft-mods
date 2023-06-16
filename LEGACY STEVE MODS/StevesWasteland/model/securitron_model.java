// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class securitron_model extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer arms;
	private final ModelRenderer armL;
	private final ModelRenderer armR;

	public securitron_model() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-0.5F, -0.8F, -2.0667F);
		Body.setTextureOffset(0, 0).addBox(-8.5F, -18.2F, -4.9333F, 17.0F, 21.0F, 14.0F, 0.0F, false);
		Body.setTextureOffset(62, 0).addBox(-7.5F, 2.8F, -3.9333F, 15.0F, 7.0F, 12.0F, 0.0F, false);
		Body.setTextureOffset(56, 66).addBox(-6.5F, 9.8F, -2.9333F, 13.0F, 4.0F, 10.0F, 0.0F, false);
		Body.setTextureOffset(14, 82).addBox(-8.5F, -2.2F, -5.9333F, 17.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(52, 4).addBox(7.5F, -8.2F, -5.9333F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 48).addBox(-3.5F, -14.2F, -5.9333F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(48, 4).addBox(-8.5F, -8.2F, -5.9333F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(48, 19).addBox(-19.5F, -23.2F, -5.9333F, 16.0F, 10.0F, 16.0F, 0.0F, false);
		Body.setTextureOffset(0, 35).addBox(3.5F, -23.2F, -5.9333F, 16.0F, 10.0F, 16.0F, 0.0F, false);
		Body.setTextureOffset(0, 61).addBox(7.5F, -13.2F, -5.9333F, 12.0F, 5.0F, 16.0F, 0.0F, false);
		Body.setTextureOffset(48, 45).addBox(-19.5F, -13.2F, -5.9333F, 12.0F, 5.0F, 16.0F, 0.0F, false);
		Body.setTextureOffset(48, 80).addBox(-2.5F, 16.8F, -1.9333F, 5.0F, 8.0F, 8.0F, 0.0F, false);
		Body.setTextureOffset(48, 0).addBox(-3.5F, 19.8F, 1.0667F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.5F, 16.8F, 1.5667F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
		cube_r1.setTextureOffset(0, 0).addBox(9.0F, -6.0F, -2.5F, 2.0F, 8.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, 16.8F, 1.5667F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
		cube_r2.setTextureOffset(0, 35).addBox(-3.0F, -4.0F, -2.5F, 2.0F, 8.0F, 5.0F, 0.0F, false);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(-3.5F, 1.8F, 2.0667F);
		Body.addChild(arms);
		

		armL = new ModelRenderer(this);
		armL.setRotationPoint(-10.0F, -9.0F, 0.0F);
		arms.addChild(armL);
		armL.setTextureOffset(0, 82).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 12.0F, 6.0F, 0.0F, false);
		armL.setTextureOffset(88, 45).addBox(-2.0F, 10.0F, -3.5F, 4.0F, 8.0F, 7.0F, 0.0F, false);

		armR = new ModelRenderer(this);
		armR.setRotationPoint(16.0F, -10.0F, 0.0F);
		arms.addChild(armR);
		armR.setTextureOffset(74, 80).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 12.0F, 6.0F, 0.0F, false);
		armR.setTextureOffset(20, 84).addBox(-2.0F, 11.0F, -3.5F, 4.0F, 8.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}