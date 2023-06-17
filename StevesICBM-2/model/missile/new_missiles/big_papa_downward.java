// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class big_papa_downward<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "big_papa_downward"), "main");
	private final ModelPart all;

	public big_papa_downward(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -48.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition Tip = all.addOrReplaceChild("Tip", CubeListBuilder.create(), PartPose.offset(8.0F, -66.0F, -8.0F));

		PartDefinition lid_top = Tip.addOrReplaceChild("lid_top", CubeListBuilder.create().texOffs(70, 197).addBox(-8.7956F, -10.0F, 4.0F, 1.5913F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(140, 115).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 3.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition hexadecagon_r1 = lid_top.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(79, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 3.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(189, 196).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = lid_top.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(180, 51).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 3.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(198, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = lid_top.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(17, 134).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = lid_top.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 200).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon = Tip.addOrReplaceChild("hexadecagon", CubeListBuilder.create().texOffs(31, 172).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(126, 195).addBox(11.0F, -9.0F, -1.7902F, 6.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.5F, 8.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r5 = hexadecagon.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(49, 195).addBox(11.0F, -9.0F, -1.7902F, 6.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(99, 167).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r6 = hexadecagon.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(147, 195).addBox(11.0F, -9.0F, -1.7902F, 6.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(130, 172).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r7 = hexadecagon.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(167, 5).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r8 = hexadecagon.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(0, 177).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition lid_bottom = Tip.addOrReplaceChild("lid_bottom", CubeListBuilder.create().texOffs(186, 57).addBox(-9.1935F, -11.5F, 2.0F, 2.3869F, 5.5F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(168, 195).addBox(-14.0F, -11.5F, 6.8065F, 12.0F, 5.5F, 2.3869F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.5F, 0.0F));

		PartDefinition hexadecagon_r9 = lid_bottom.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(191, 122).addBox(-6.0F, -3.5F, -1.1935F, 12.0F, 5.5F, 2.3869F, new CubeDeformation(0.0F))
		.texOffs(80, 178).addBox(-1.1935F, -3.5F, -6.0F, 2.3869F, 5.5F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r10 = lid_bottom.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(197, 161).addBox(-6.0F, -3.5F, -1.1935F, 12.0F, 5.5F, 2.3869F, new CubeDeformation(0.0F))
		.texOffs(189, 80).addBox(-1.1935F, -3.5F, -6.0F, 2.3869F, 5.5F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r11 = lid_bottom.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(0, 134).addBox(-1.1935F, -3.5F, -6.0F, 2.3869F, 5.5F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r12 = lid_bottom.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(97, 190).addBox(-1.1935F, -3.5F, -6.0F, 2.3869F, 5.5F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition body2 = all.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -81.5F, 0.0F));

		PartDefinition Body = body2.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 67).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(39, 118).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 43.5F, 0.0F));

		PartDefinition hexadecagon_r13 = Body.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(101, 67).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(62, 51).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r14 = Body.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(78, 121).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r15 = Body.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(39, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r16 = Body.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(85, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition mid = body2.addOrReplaceChild("mid", CubeListBuilder.create().texOffs(124, 23).addBox(8.5F, -1.7902F, -9.0F, 12.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(179, 172).addBox(8.5F, -9.0F, -1.7902F, 12.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 30.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r17 = mid.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(179, 138).addBox(8.5F, -9.0F, -1.7902F, 12.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(124, 0).addBox(8.5F, -1.7902F, -9.0F, 12.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r18 = mid.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(185, 28).addBox(8.5F, -9.0F, -1.7902F, 12.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(137, 46).addBox(8.5F, -1.7902F, -9.0F, 12.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r19 = mid.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(117, 121).addBox(8.5F, -1.7902F, -9.0F, 12.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r20 = mid.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(140, 69).addBox(8.5F, -1.7902F, -9.0F, 12.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bottom = body2.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(148, 149).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(39, 90).addBox(11.0F, -9.0F, -1.7902F, 6.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 54.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r21 = bottom.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(39, 67).addBox(11.0F, -9.0F, -1.7902F, 6.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(117, 144).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r22 = bottom.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(191, 99).addBox(11.0F, -9.0F, -1.7902F, 6.0F, 18.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(0, 154).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r23 = bottom.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(140, 92).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r24 = bottom.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(160, 115).addBox(11.0F, -1.7902F, -9.0F, 6.0F, 3.5804F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Thruster = all.addOrReplaceChild("Thruster", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Thruster.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -3.25F, -1.4946F, 1.0F, 5.0F, 2.9891F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3028F, -3.7495F, -5.4449F, -1.5708F, -1.1345F, 1.5708F));

		PartDefinition cube_r2 = Thruster.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -3.75F, -1.4946F, 1.0F, 5.5F, 2.9891F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3028F, -3.7495F, 5.5506F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition cube_r3 = Thruster.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(89, 6).addBox(-0.5F, -3.25F, -1.4946F, 1.0F, 5.0F, 2.9891F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7477F, -3.7495F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r4 = Thruster.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -3.75F, -1.4946F, 1.0F, 5.5F, 2.9891F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2477F, -3.7495F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition hexadecagon = Thruster.addOrReplaceChild("hexadecagon", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0F, -0.9946F, -5.0F, 3.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 67).addBox(-1.0F, -5.0F, -0.9946F, 3.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -8.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r25 = hexadecagon.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -0.9946F, 3.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F))
		.texOffs(62, 0).addBox(-1.0F, -0.9946F, -5.0F, 3.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r26 = hexadecagon.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create().texOffs(23, 67).addBox(-1.0F, -5.0F, -0.9946F, 3.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F))
		.texOffs(124, 46).addBox(-1.0F, -0.9946F, -5.0F, 3.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r27 = hexadecagon.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, -0.9946F, -5.0F, 3.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r28 = hexadecagon.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create().texOffs(62, 175).addBox(-1.0F, -0.9946F, -5.0F, 3.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}