// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class richard_downward extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer shaft;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer barrel;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer head;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer tip;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer ball1;
	private final ModelRenderer ball2;

	public richard_downward() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, -34.0F, 0.0F);
		setRotationAngle(all, -3.1416F, 0.0F, 0.0F);
		

		shaft = new ModelRenderer(this);
		shaft.setRotationPoint(8.0F, -17.0F, -8.0F);
		all.addChild(shaft);
		shaft.setTextureOffset(0, 0).addBox(-10.4853F, -28.5F, 2.0F, 4.0F, 41.0F, 12.0F, 0.0F, false);
		shaft.setTextureOffset(0, 0).addBox(-14.0F, -28.5F, 5.5147F, 12.0F, 41.0F, 4.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		shaft.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(0, 0).addBox(-6.0F, -20.5F, -2.4853F, 12.0F, 41.0F, 4.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 0).addBox(-2.4853F, -20.5F, -6.0F, 4.0F, 41.0F, 12.0F, 0.0F, false);

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(8.0F, 5.5F, -8.0F);
		all.addChild(barrel);
		barrel.setTextureOffset(0, 54).addBox(-9.2426F, -10.0F, 5.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		barrel.setTextureOffset(0, 54).addBox(-11.0F, -10.0F, 6.7574F, 6.0F, 4.0F, 2.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		barrel.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(0, 54).addBox(-3.0F, -2.0F, -1.2426F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 54).addBox(-1.2426F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(8.0F, -41.0F, -8.0F);
		all.addChild(head);
		head.setTextureOffset(20, 40).addBox(-11.3137F, -12.0F, 0.0F, 6.0F, 8.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(20, 50).addBox(-16.0F, -12.0F, 4.6863F, 16.0F, 8.0F, 6.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		head.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(20, 50).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.0F, 0.0F, false);
		octagon_r3.setTextureOffset(20, 40).addBox(-3.3137F, -4.0F, -8.0F, 6.0F, 8.0F, 16.0F, 0.0F, false);

		tip = new ModelRenderer(this);
		tip.setRotationPoint(8.0F, -47.0F, -8.0F);
		all.addChild(tip);
		tip.setTextureOffset(36, 50).addBox(-10.0711F, -10.0F, 3.0F, 4.0F, 4.0F, 10.0F, 0.0F, false);
		tip.setTextureOffset(36, 50).addBox(-13.0F, -10.0F, 5.9289F, 10.0F, 4.0F, 4.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tip.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
		octagon_r4.setTextureOffset(36, 50).addBox(-5.0F, -2.0F, -2.0711F, 10.0F, 4.0F, 4.0F, 0.0F, false);
		octagon_r4.setTextureOffset(36, 50).addBox(-2.0711F, -2.0F, -5.0F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		ball1 = new ModelRenderer(this);
		ball1.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(ball1);
		setRotationAngle(ball1, 0.0F, 0.0F, 0.4363F);
		ball1.setTextureOffset(32, 0).addBox(-18.0F, -10.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);

		ball2 = new ModelRenderer(this);
		ball2.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(ball2);
		setRotationAngle(ball2, 3.1416F, 0.0F, 2.7053F);
		ball2.setTextureOffset(32, 0).addBox(-18.0F, -10.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);
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