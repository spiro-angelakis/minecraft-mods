// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class turret_nugget extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer base;
	private final ModelRenderer head;

	public turret_nugget() {
		textureWidth = 32;
		textureHeight = 32;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(base);
		base.setTextureOffset(16, 26).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		base.setTextureOffset(24, 21).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -5.0F, 0.0F);
		all.addChild(head);
		head.setTextureOffset(0, 15).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 0).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 11).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 4.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
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