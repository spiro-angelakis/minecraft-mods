// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class tsar_bomba extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer base;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer stem;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer tube_bottom;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer octagon_r5;
	private final ModelRenderer octagon_r6;
	private final ModelRenderer octagon_r7;
	private final ModelRenderer octagon_r8;
	private final ModelRenderer octagon_r9;
	private final ModelRenderer octagon_r10;
	private final ModelRenderer octagon_r11;
	private final ModelRenderer octagon_r12;
	private final ModelRenderer octagon_r13;
	private final ModelRenderer octagon_r14;
	private final ModelRenderer octagon_r15;
	private final ModelRenderer octagon_r16;
	private final ModelRenderer octagon_r17;
	private final ModelRenderer octagon_r18;
	private final ModelRenderer octagon_r19;
	private final ModelRenderer tube_mid;
	private final ModelRenderer octagon_r20;
	private final ModelRenderer tube_top1;
	private final ModelRenderer octagon_r21;
	private final ModelRenderer octagon_r22;
	private final ModelRenderer octagon_r23;
	private final ModelRenderer octagon_r24;
	private final ModelRenderer tube_top2;
	private final ModelRenderer octagon_r25;
	private final ModelRenderer octagon_r26;
	private final ModelRenderer octagon_r27;
	private final ModelRenderer octagon_r28;
	private final ModelRenderer cap;
	private final ModelRenderer octagon_r29;

	public tsar_bomba() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, -3.0F, 0.0F);
		all.addChild(base);
		base.setTextureOffset(54, 0).addBox(-2.4853F, -2.0F, -6.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		base.setTextureOffset(54, 0).addBox(-6.0F, -2.0F, -2.4853F, 12.0F, 4.0F, 4.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(54, 0).addBox(-6.0F, -2.0F, -2.4853F, 12.0F, 4.0F, 4.0F, 0.0F, false);
		octagon_r1.setTextureOffset(54, 0).addBox(-2.4853F, -2.0F, -6.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);

		stem = new ModelRenderer(this);
		stem.setRotationPoint(0.0F, -8.0F, 0.0F);
		all.addChild(stem);
		setRotationAngle(stem, 0.0F, -0.3927F, 0.0F);
		stem.setTextureOffset(0, 26).addBox(-0.8284F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		stem.setTextureOffset(0, 26).addBox(-2.0F, -3.0F, -0.8284F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(0, 26).addBox(-2.0F, -3.0F, -0.8284F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 26).addBox(-0.8284F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		tube_bottom = new ModelRenderer(this);
		tube_bottom.setRotationPoint(0.0F, -17.0F, 0.0F);
		all.addChild(tube_bottom);
		tube_bottom.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);
		tube_bottom.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -2.4853F, 12.0F, 12.0F, 4.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube_bottom.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -2.4853F, 12.0F, 12.0F, 4.0F, 0.0F, false);
		octagon_r3.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(-3.5F, -9.0F, 1.5F);
		tube_bottom.addChild(octagon_r4);
		setRotationAngle(octagon_r4, -2.5744F, 1.1781F, 3.1416F);
		octagon_r4.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(-1.5F, -9.0F, 3.5F);
		tube_bottom.addChild(octagon_r5);
		setRotationAngle(octagon_r5, -2.5744F, 0.3927F, 3.1416F);
		octagon_r5.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(1.5F, -9.0F, 3.5F);
		tube_bottom.addChild(octagon_r6);
		setRotationAngle(octagon_r6, -2.5744F, -0.3927F, 3.1416F);
		octagon_r6.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(3.5F, -9.0F, 2.0F);
		tube_bottom.addChild(octagon_r7);
		setRotationAngle(octagon_r7, -2.5744F, -1.1781F, 3.1416F);
		octagon_r7.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(3.5F, -9.0F, -2.0F);
		tube_bottom.addChild(octagon_r8);
		setRotationAngle(octagon_r8, 0.5672F, -1.1781F, 0.0F);
		octagon_r8.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r9 = new ModelRenderer(this);
		octagon_r9.setRotationPoint(1.5F, -9.0F, -4.0F);
		tube_bottom.addChild(octagon_r9);
		setRotationAngle(octagon_r9, 0.5672F, -0.3927F, 0.0F);
		octagon_r9.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r10 = new ModelRenderer(this);
		octagon_r10.setRotationPoint(-1.5F, -9.0F, -4.0F);
		tube_bottom.addChild(octagon_r10);
		setRotationAngle(octagon_r10, 0.5672F, 0.3927F, 0.0F);
		octagon_r10.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r11 = new ModelRenderer(this);
		octagon_r11.setRotationPoint(-3.5F, -9.0F, -2.0F);
		tube_bottom.addChild(octagon_r11);
		setRotationAngle(octagon_r11, 0.5672F, 1.1781F, 0.0F);
		octagon_r11.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r12 = new ModelRenderer(this);
		octagon_r12.setRotationPoint(-3.0F, -9.0F, -3.0F);
		tube_bottom.addChild(octagon_r12);
		setRotationAngle(octagon_r12, 0.5672F, 0.7854F, 0.0F);
		octagon_r12.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r13 = new ModelRenderer(this);
		octagon_r13.setRotationPoint(3.0F, -9.0F, -3.0F);
		tube_bottom.addChild(octagon_r13);
		setRotationAngle(octagon_r13, 0.5672F, -0.7854F, 0.0F);
		octagon_r13.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r14 = new ModelRenderer(this);
		octagon_r14.setRotationPoint(3.0F, -9.0F, 3.0F);
		tube_bottom.addChild(octagon_r14);
		setRotationAngle(octagon_r14, -2.5744F, -0.7854F, 3.1416F);
		octagon_r14.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r15 = new ModelRenderer(this);
		octagon_r15.setRotationPoint(-3.0F, -9.0F, 3.0F);
		tube_bottom.addChild(octagon_r15);
		setRotationAngle(octagon_r15, -2.5744F, 0.7854F, 3.1416F);
		octagon_r15.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r16 = new ModelRenderer(this);
		octagon_r16.setRotationPoint(0.0F, -9.0F, 4.0F);
		tube_bottom.addChild(octagon_r16);
		setRotationAngle(octagon_r16, -2.5744F, 0.0F, 3.1416F);
		octagon_r16.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r17 = new ModelRenderer(this);
		octagon_r17.setRotationPoint(4.0F, -9.0F, 0.0F);
		tube_bottom.addChild(octagon_r17);
		setRotationAngle(octagon_r17, 0.0F, -1.5708F, 0.5672F);
		octagon_r17.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r18 = new ModelRenderer(this);
		octagon_r18.setRotationPoint(-4.0F, -9.0F, 0.0F);
		tube_bottom.addChild(octagon_r18);
		setRotationAngle(octagon_r18, 0.0F, 1.5708F, -0.5672F);
		octagon_r18.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		octagon_r19 = new ModelRenderer(this);
		octagon_r19.setRotationPoint(0.0F, -9.0F, -4.0F);
		tube_bottom.addChild(octagon_r19);
		setRotationAngle(octagon_r19, 0.5672F, 0.0F, 0.0F);
		octagon_r19.setTextureOffset(0, 0).addBox(-2.4853F, -6.0F, -6.0F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		tube_mid = new ModelRenderer(this);
		tube_mid.setRotationPoint(0.0F, -40.5F, 0.0F);
		all.addChild(tube_mid);
		tube_mid.setTextureOffset(0, 0).addBox(-5.3848F, -13.0F, -13.0F, 10.0F, 26.0F, 26.0F, 0.0F, false);
		tube_mid.setTextureOffset(0, 0).addBox(-13.0F, -13.0F, -5.3848F, 26.0F, 26.0F, 10.0F, 0.0F, false);

		octagon_r20 = new ModelRenderer(this);
		octagon_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube_mid.addChild(octagon_r20);
		setRotationAngle(octagon_r20, 0.0F, -0.7854F, 0.0F);
		octagon_r20.setTextureOffset(0, 0).addBox(-13.0F, -13.0F, -5.3848F, 26.0F, 26.0F, 10.0F, 0.0F, false);
		octagon_r20.setTextureOffset(0, 0).addBox(-5.3848F, -13.0F, -13.0F, 10.0F, 26.0F, 26.0F, 0.0F, false);

		tube_top1 = new ModelRenderer(this);
		tube_top1.setRotationPoint(0.0F, -61.0F, 0.0F);
		all.addChild(tube_top1);
		

		octagon_r21 = new ModelRenderer(this);
		octagon_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube_top1.addChild(octagon_r21);
		setRotationAngle(octagon_r21, 0.0F, 0.0F, 0.3927F);
		octagon_r21.setTextureOffset(0, 99).addBox(-9.25F, -4.0F, -5.3848F, 13.0F, 16.0F, 10.0F, 0.0F, false);

		octagon_r22 = new ModelRenderer(this);
		octagon_r22.setRotationPoint(0.0F, 4.0F, 0.0F);
		tube_top1.addChild(octagon_r22);
		setRotationAngle(octagon_r22, -0.3655F, -0.7119F, 0.5299F);
		octagon_r22.setTextureOffset(0, 99).addBox(-11.0F, -8.0F, -5.3848F, 14.0F, 16.0F, 10.0F, 0.0F, false);

		octagon_r23 = new ModelRenderer(this);
		octagon_r23.setRotationPoint(0.0F, 5.0F, 2.0F);
		tube_top1.addChild(octagon_r23);
		setRotationAngle(octagon_r23, -0.3927F, 0.0F, 0.0F);
		octagon_r23.setTextureOffset(0, 99).addBox(-5.3848F, -8.0F, -13.0F, 10.0F, 16.0F, 13.0F, 0.0F, false);

		octagon_r24 = new ModelRenderer(this);
		octagon_r24.setRotationPoint(0.0F, 4.25F, 0.0F);
		tube_top1.addChild(octagon_r24);
		setRotationAngle(octagon_r24, -0.3927F, -0.7854F, 0.0F);
		octagon_r24.setTextureOffset(0, 99).addBox(-5.3848F, -8.0F, -11.0F, 10.0F, 16.0F, 13.0F, 0.0F, false);

		tube_top2 = new ModelRenderer(this);
		tube_top2.setRotationPoint(0.0F, -61.0F, 0.0F);
		all.addChild(tube_top2);
		setRotationAngle(tube_top2, -3.1416F, 0.0F, 3.1416F);
		

		octagon_r25 = new ModelRenderer(this);
		octagon_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube_top2.addChild(octagon_r25);
		setRotationAngle(octagon_r25, 0.0F, 0.0F, 0.3927F);
		octagon_r25.setTextureOffset(0, 99).addBox(-9.25F, -4.0F, -5.3848F, 13.0F, 16.0F, 10.0F, 0.0F, false);

		octagon_r26 = new ModelRenderer(this);
		octagon_r26.setRotationPoint(0.0F, 4.0F, 0.0F);
		tube_top2.addChild(octagon_r26);
		setRotationAngle(octagon_r26, -0.3655F, -0.7119F, 0.5299F);
		octagon_r26.setTextureOffset(0, 99).addBox(-11.0F, -8.0F, -5.3848F, 14.0F, 16.0F, 10.0F, 0.0F, false);

		octagon_r27 = new ModelRenderer(this);
		octagon_r27.setRotationPoint(0.0F, 5.0F, 2.0F);
		tube_top2.addChild(octagon_r27);
		setRotationAngle(octagon_r27, -0.3927F, 0.0F, 0.0F);
		octagon_r27.setTextureOffset(0, 99).addBox(-5.3848F, -8.0F, -13.0F, 10.0F, 16.0F, 13.0F, 0.0F, false);

		octagon_r28 = new ModelRenderer(this);
		octagon_r28.setRotationPoint(0.0F, 4.25F, 0.0F);
		tube_top2.addChild(octagon_r28);
		setRotationAngle(octagon_r28, -0.3927F, -0.7854F, 0.0F);
		octagon_r28.setTextureOffset(0, 99).addBox(-5.3848F, -8.0F, -11.0F, 10.0F, 16.0F, 13.0F, 0.0F, false);

		cap = new ModelRenderer(this);
		cap.setRotationPoint(0.0F, -72.0F, 0.0F);
		all.addChild(cap);
		cap.setTextureOffset(84, 104).addBox(-3.3137F, -4.0F, -8.0F, 6.0F, 8.0F, 16.0F, 0.0F, false);
		cap.setTextureOffset(84, 104).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.0F, 0.0F, false);
		cap.setTextureOffset(0, 0).addBox(-6.0F, -13.0F, 0.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		cap.setTextureOffset(0, 0).addBox(4.0F, -13.0F, 0.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		octagon_r29 = new ModelRenderer(this);
		octagon_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		cap.addChild(octagon_r29);
		setRotationAngle(octagon_r29, 0.0F, -0.7854F, 0.0F);
		octagon_r29.setTextureOffset(84, 104).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.0F, 0.0F, false);
		octagon_r29.setTextureOffset(84, 104).addBox(-3.3137F, -4.0F, -8.0F, 6.0F, 8.0F, 16.0F, 0.0F, false);
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