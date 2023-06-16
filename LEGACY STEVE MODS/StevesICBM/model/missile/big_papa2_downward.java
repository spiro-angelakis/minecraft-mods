// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class big_papa2_downward extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer lid_top;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer lid_bottom;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer cap;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer spoutfin4;
	private final ModelRenderer spoutfin3;
	private final ModelRenderer spoutfin2;
	private final ModelRenderer spoutfin1;
	private final ModelRenderer spout;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer tube;
	private final ModelRenderer hexadecagon_r13;
	private final ModelRenderer hexadecagon_r14;
	private final ModelRenderer hexadecagon_r15;
	private final ModelRenderer hexadecagon_r16;
	private final ModelRenderer bone;

	public big_papa2_downward() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, -60.0F, 0.0F);
		setRotationAngle(all, 0.0F, 0.0F, -3.1416F);
		

		lid_top = new ModelRenderer(this);
		lid_top.setRotationPoint(8.0F, -73.0F, -8.0F);
		all.addChild(lid_top);
		lid_top.setTextureOffset(46, 54).addBox(-8.7956F, -9.0F, 4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		lid_top.setTextureOffset(46, 54).addBox(-12.0F, -9.0F, 7.2044F, 8.0F, 2.0F, 1.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_top.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(46, 54).addBox(-4.0F, -1.0F, -0.7956F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(46, 54).addBox(-0.7956F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_top.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(46, 54).addBox(-4.0F, -1.0F, -0.7956F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(46, 54).addBox(-0.7956F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_top.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(46, 54).addBox(-0.7956F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_top.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(46, 54).addBox(-0.7956F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		lid_bottom = new ModelRenderer(this);
		lid_bottom.setRotationPoint(8.0F, -70.0F, -8.0F);
		all.addChild(lid_bottom);
		lid_bottom.setTextureOffset(36, 48).addBox(-9.1935F, -10.0F, 2.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);
		lid_bottom.setTextureOffset(36, 48).addBox(-14.0F, -10.0F, 6.8065F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_bottom.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r5.setTextureOffset(36, 48).addBox(-6.0F, -2.0F, -1.1935F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(36, 48).addBox(-1.1935F, -2.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_bottom.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r6.setTextureOffset(36, 48).addBox(-6.0F, -2.0F, -1.1935F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(36, 48).addBox(-1.1935F, -2.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_bottom.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r7.setTextureOffset(36, 48).addBox(-1.1935F, -2.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(-8.0F, -8.0F, 8.0F);
		lid_bottom.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r8.setTextureOffset(36, 48).addBox(-1.1935F, -2.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);

		cap = new ModelRenderer(this);
		cap.setRotationPoint(8.0F, -64.0F, -8.0F);
		all.addChild(cap);
		cap.setTextureOffset(14, 38).addBox(-11.7279F, -12.0F, -1.0F, 7.0F, 8.0F, 18.0F, 0.0F, false);
		cap.setTextureOffset(14, 38).addBox(-17.0F, -12.0F, 4.2721F, 18.0F, 8.0F, 7.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		cap.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(14, 38).addBox(-9.0F, -4.0F, -3.7279F, 18.0F, 8.0F, 7.0F, 0.0F, false);
		octagon_r1.setTextureOffset(14, 38).addBox(-3.7279F, -4.0F, -9.0F, 7.0F, 8.0F, 18.0F, 0.0F, false);

		spoutfin4 = new ModelRenderer(this);
		spoutfin4.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(spoutfin4);
		setRotationAngle(spoutfin4, 1.5708F, 1.2654F, 1.5708F);
		spoutfin4.setTextureOffset(54, 13).addBox(-4.9537F, -2.8993F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		spoutfin3 = new ModelRenderer(this);
		spoutfin3.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(spoutfin3);
		setRotationAngle(spoutfin3, 3.1416F, 0.0F, 2.8362F);
		spoutfin3.setTextureOffset(54, 13).addBox(-4.9537F, -2.8993F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		spoutfin2 = new ModelRenderer(this);
		spoutfin2.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(spoutfin2);
		setRotationAngle(spoutfin2, -1.5708F, -1.2654F, 1.5708F);
		spoutfin2.setTextureOffset(54, 12).addBox(-4.9537F, -2.8993F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		spoutfin1 = new ModelRenderer(this);
		spoutfin1.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(spoutfin1);
		setRotationAngle(spoutfin1, 0.0F, 0.0F, 0.3054F);
		spoutfin1.setTextureOffset(54, 12).addBox(-4.9537F, -2.8993F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		spout = new ModelRenderer(this);
		spout.setRotationPoint(8.0F, 2.0F, -8.0F);
		all.addChild(spout);
		spout.setTextureOffset(46, 0).addBox(-8.7956F, -10.0F, 4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		spout.setTextureOffset(46, 0).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.0F, 0.0F, false);

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(-8.0F, -8.0F, 8.0F);
		spout.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r9.setTextureOffset(46, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(-8.0F, -8.0F, 8.0F);
		spout.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r10.setTextureOffset(46, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(-8.0F, -8.0F, 8.0F);
		spout.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r11.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(-8.0F, -8.0F, 8.0F);
		spout.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r12.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		tube = new ModelRenderer(this);
		tube.setRotationPoint(8.0F, -30.0F, -8.0F);
		all.addChild(tube);
		tube.setTextureOffset(0, 0).addBox(-9.5913F, -38.0F, 0.0F, 3.0F, 60.0F, 16.0F, 0.0F, false);
		tube.setTextureOffset(0, 0).addBox(-16.0F, -38.0F, 6.4087F, 16.0F, 60.0F, 3.0F, 0.0F, false);

		hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r13.setTextureOffset(0, 0).addBox(-8.0F, -30.0F, -1.5913F, 16.0F, 60.0F, 3.0F, 0.0F, false);
		hexadecagon_r13.setTextureOffset(0, 0).addBox(-1.5913F, -30.0F, -8.0F, 3.0F, 60.0F, 16.0F, 0.0F, false);

		hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r14.setTextureOffset(0, 0).addBox(-8.0F, -30.0F, -1.5913F, 16.0F, 60.0F, 3.0F, 0.0F, false);

		hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r15.setTextureOffset(0, 0).addBox(-1.5913F, -30.0F, -8.0F, 3.0F, 60.0F, 16.0F, 0.0F, false);

		hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r16.setTextureOffset(0, 0).addBox(-1.5913F, -30.0F, -8.0F, 3.0F, 60.0F, 16.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube.addChild(bone);
		
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