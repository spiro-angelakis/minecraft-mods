// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class emp_pulse extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer octagon1;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer octagon2;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer octagon3;
	private final ModelRenderer octagon_r3;

	public emp_pulse() {
		textureWidth = 256;
		textureHeight = 256;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		octagon1 = new ModelRenderer(this);
		octagon1.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(octagon1);
		octagon1.setTextureOffset(76, 160).addBox(-13.2548F, -48.0F, -32.0F, 26.0F, 32.0F, 64.0F, 0.0F, false);
		octagon1.setTextureOffset(76, 160).addBox(-32.0F, -48.0F, -13.2548F, 64.0F, 32.0F, 26.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, -32.0F, 0.0F);
		octagon1.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(76, 160).addBox(-32.0F, -16.0F, -13.2548F, 64.0F, 32.0F, 26.0F, 0.0F, false);
		octagon_r1.setTextureOffset(76, 160).addBox(-13.2548F, -16.0F, -32.0F, 26.0F, 32.0F, 64.0F, 0.0F, false);

		octagon2 = new ModelRenderer(this);
		octagon2.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(octagon2);
		octagon2.setTextureOffset(64, 59).addBox(-16.0F, -45.2548F, -32.0F, 32.0F, 26.0F, 64.0F, 0.0F, false);
		octagon2.setTextureOffset(64, 59).addBox(-16.0F, -64.0F, -13.2548F, 32.0F, 64.0F, 26.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, -32.0F, 0.0F);
		octagon2.addChild(octagon_r2);
		setRotationAngle(octagon_r2, -0.7854F, 0.0F, 0.0F);
		octagon_r2.setTextureOffset(64, 59).addBox(-16.0F, -32.0F, -13.2548F, 32.0F, 64.0F, 26.0F, 0.0F, false);
		octagon_r2.setTextureOffset(64, 59).addBox(-16.0F, -13.2548F, -32.0F, 32.0F, 26.0F, 64.0F, 0.0F, false);

		octagon3 = new ModelRenderer(this);
		octagon3.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(octagon3);
		octagon3.setTextureOffset(0, 18).addBox(-13.2548F, -64.0F, -16.0F, 26.0F, 64.0F, 32.0F, 0.0F, false);
		octagon3.setTextureOffset(0, 18).addBox(-32.0F, -45.2548F, -16.0F, 64.0F, 26.0F, 32.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, -32.0F, 0.0F);
		octagon3.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, 0.0F, 0.7854F);
		octagon_r3.setTextureOffset(0, 18).addBox(-32.0F, -13.2548F, -16.0F, 64.0F, 26.0F, 32.0F, 0.0F, false);
		octagon_r3.setTextureOffset(0, 18).addBox(-13.2548F, -32.0F, -16.0F, 26.0F, 64.0F, 32.0F, 0.0F, false);
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