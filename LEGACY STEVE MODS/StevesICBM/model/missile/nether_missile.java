// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class nether_missile extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer base;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer base_lid;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer base_stem;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer tube;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer cap;
	private final ModelRenderer octagon_r4;

	public nether_missile() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		base = new ModelRenderer(this);
		base.setRotationPoint(8.0F, 3.25F, -8.0F);
		all.addChild(base);
		base.setTextureOffset(0, 32).addBox(-12.9706F, -12.0F, -4.0F, 9.0F, 8.0F, 24.0F, 0.0F, false);
		base.setTextureOffset(0, 32).addBox(-20.0F, -12.0F, 3.0294F, 24.0F, 8.0F, 9.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		base.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(0, 32).addBox(-12.0F, -4.0F, -4.9706F, 24.0F, 8.0F, 9.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 32).addBox(-4.9706F, -4.0F, -12.0F, 9.0F, 8.0F, 24.0F, 0.0F, false);

		base_lid = new ModelRenderer(this);
		base_lid.setRotationPoint(8.0F, -1.75F, -8.0F);
		all.addChild(base_lid);
		base_lid.setTextureOffset(0, 46).addBox(-11.3137F, -9.0F, 0.0F, 6.0F, 2.0F, 16.0F, 0.0F, false);
		base_lid.setTextureOffset(0, 46).addBox(-16.0F, -9.0F, 4.6863F, 16.0F, 2.0F, 6.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		base_lid.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(0, 46).addBox(-8.0F, -1.0F, -3.3137F, 16.0F, 2.0F, 6.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 46).addBox(-3.3137F, -1.0F, -8.0F, 6.0F, 2.0F, 16.0F, 0.0F, false);

		base_stem = new ModelRenderer(this);
		base_stem.setRotationPoint(8.0F, -4.75F, -8.0F);
		all.addChild(base_stem);
		base_stem.setTextureOffset(42, 31).addBox(-9.6569F, -10.0F, 4.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);
		base_stem.setTextureOffset(42, 31).addBox(-12.0F, -10.0F, 6.3431F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		base_stem.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(42, 31).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.0F, 0.0F, false);
		octagon_r3.setTextureOffset(42, 31).addBox(-1.6569F, -2.0F, -4.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);

		tube = new ModelRenderer(this);
		tube.setRotationPoint(8.0F, -25.0F, -8.0F);
		all.addChild(tube);
		tube.setTextureOffset(0, 0).addBox(-9.5913F, -26.0F, 0.0F, 3.0F, 36.0F, 16.0F, 0.0F, false);
		tube.setTextureOffset(0, 0).addBox(-16.0F, -26.0F, 6.4087F, 16.0F, 36.0F, 3.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.0F, 36.0F, 16.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.0F, 36.0F, 16.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.0F, 36.0F, 16.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.0F, 36.0F, 16.0F, 0.0F, false);

		cap = new ModelRenderer(this);
		cap.setRotationPoint(8.0F, -47.0F, -8.0F);
		all.addChild(cap);
		cap.setTextureOffset(20, 40).addBox(-11.3137F, -12.0F, 0.0F, 6.0F, 8.0F, 16.0F, 0.0F, false);
		cap.setTextureOffset(20, 40).addBox(-16.0F, -12.0F, 4.6863F, 16.0F, 8.0F, 6.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		cap.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
		octagon_r4.setTextureOffset(20, 40).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.0F, 0.0F, false);
		octagon_r4.setTextureOffset(20, 40).addBox(-3.3137F, -4.0F, -8.0F, 6.0F, 8.0F, 16.0F, 0.0F, false);
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