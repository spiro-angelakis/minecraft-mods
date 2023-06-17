// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class tsar_bomba_downward<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "tsar_bomba_downward"), "main");
	private final ModelPart all;

	public tsar_bomba_downward(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -61.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition tip = all.addOrReplaceChild("tip", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition top = tip.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition octagon_r1 = top.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 115).addBox(-5.3848F, -8.0F, -11.0F, 10.7696F, 16.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.75F, 0.0F, 2.7489F, 0.7854F, 3.1416F));

		PartDefinition octagon_r2 = top.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(96, 0).addBox(-5.3848F, -8.0F, -13.0F, 10.7696F, 16.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, -2.0F, 2.7489F, 0.0F, 3.1416F));

		PartDefinition octagon_r3 = top.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(122, 29).addBox(-11.0F, -8.0F, -5.3848F, 14.0F, 16.0F, 10.7696F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -57.0F, 0.0F, 2.7761F, 0.7119F, 2.6117F));

		PartDefinition octagon_r4 = top.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(137, 56).addBox(-9.25F, -4.0F, -5.3848F, 13.0F, 16.0F, 10.7696F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -61.0F, 0.0F, -3.1416F, 0.0F, 2.7489F));

		PartDefinition octagon_r5 = top.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(96, 115).addBox(-5.3848F, -8.0F, -11.0F, 10.7696F, 16.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.75F, 0.0F, -0.3927F, -0.7854F, 0.0F));

		PartDefinition octagon_r6 = top.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(48, 115).addBox(-5.3848F, -8.0F, -13.0F, 10.7696F, 16.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition octagon_r7 = top.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(133, 133).addBox(-11.0F, -8.0F, -5.3848F, 14.0F, 16.0F, 10.7696F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -57.0F, 0.0F, -0.3655F, -0.7119F, 0.5299F));

		PartDefinition octagon_r8 = top.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(0, 144).addBox(-9.25F, -4.0F, -5.3848F, 13.0F, 16.0F, 10.7696F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -61.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cap = tip.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(48, 0).addBox(-3.3137F, -4.0F, -8.0F, 6.6274F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(141, 108).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-6.0F, -13.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(4.0F, -13.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -55.0F, 0.0F));

		PartDefinition octagon_r9 = cap.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(144, 0).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(0, 52).addBox(-3.3137F, -4.0F, -8.0F, 6.6274F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Thruster = all.addOrReplaceChild("Thruster", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition base = Thruster.addOrReplaceChild("base", CubeListBuilder.create().texOffs(180, 95).addBox(-2.4853F, -2.0F, -6.0F, 4.9706F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(96, 29).addBox(-6.0F, -2.0F, -2.4853F, 12.0F, 4.0F, 4.9706F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition octagon_r10 = base.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(182, 172).addBox(-6.0F, -2.0F, -2.4853F, 12.0F, 4.0F, 4.9706F, new CubeDeformation(0.0F))
		.texOffs(63, 192).addBox(-2.4853F, -2.0F, -6.0F, 4.9706F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition stem = Thruster.addOrReplaceChild("stem", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8284F, -3.0F, -2.0F, 1.6569F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.0F, -3.0F, -0.8284F, 4.0F, 6.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r11 = stem.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(12, 16).addBox(-2.0F, -3.0F, -0.8284F, 4.0F, 6.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(8, 6).addBox(-0.8284F, -3.0F, -2.0F, 1.6569F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition bodymid = body.addOrReplaceChild("bodymid", CubeListBuilder.create().texOffs(0, 0).addBox(-5.3848F, -13.0F, -13.0F, 10.7696F, 26.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(0, 78).addBox(-13.0F, -13.0F, -5.3848F, 26.0F, 26.0F, 10.7696F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.5F, 0.0F));

		PartDefinition octagon_r12 = bodymid.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(74, 78).addBox(-13.0F, -13.0F, -5.3848F, 26.0F, 26.0F, 10.7696F, new CubeDeformation(0.0F))
		.texOffs(48, 26).addBox(-5.3848F, -13.0F, -13.0F, 10.7696F, 26.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition boybottom = body.addOrReplaceChild("boybottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom = boybottom.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(126, 184).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(29, 192).addBox(-6.0F, -6.0F, -2.4853F, 12.0F, 12.0F, 4.9706F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition octagon_r13 = bottom.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(193, 135).addBox(-6.0F, -6.0F, -2.4853F, 12.0F, 12.0F, 4.9706F, new CubeDeformation(0.0F))
		.texOffs(182, 184).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone2 = boybottom.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-3.0F, -9.0F, 3.0F));

		PartDefinition octagon_r14 = bone2.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(183, 3).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -7.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition octagon_r15 = bone2.addOrReplaceChild("octagon_r15", CubeListBuilder.create().texOffs(92, 180).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -3.0F, 0.0F, 1.5708F, -0.5672F));

		PartDefinition octagon_r16 = bone2.addOrReplaceChild("octagon_r16", CubeListBuilder.create().texOffs(175, 111).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, -3.0F, 0.0F, -1.5708F, 0.5672F));

		PartDefinition octagon_r17 = bone2.addOrReplaceChild("octagon_r17", CubeListBuilder.create().texOffs(48, 144).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, -2.5744F, 1.1781F, 3.1416F));

		PartDefinition octagon_r18 = bone2.addOrReplaceChild("octagon_r18", CubeListBuilder.create().texOffs(82, 144).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, -2.5744F, 0.3927F, 3.1416F));

		PartDefinition octagon_r19 = bone2.addOrReplaceChild("octagon_r19", CubeListBuilder.create().texOffs(0, 171).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.5672F, 0.7854F, 0.0F));

		PartDefinition octagon_r20 = bone2.addOrReplaceChild("octagon_r20", CubeListBuilder.create().texOffs(148, 83).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.0F, 0.5F, -2.5744F, -0.3927F, 3.1416F));

		PartDefinition octagon_r21 = bone2.addOrReplaceChild("octagon_r21", CubeListBuilder.create().texOffs(104, 156).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.0F, -1.0F, -2.5744F, -1.1781F, 3.1416F));

		PartDefinition octagon_r22 = bone2.addOrReplaceChild("octagon_r22", CubeListBuilder.create().texOffs(138, 160).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.0F, -5.0F, 0.5672F, -1.1781F, 0.0F));

		PartDefinition octagon_r23 = bone2.addOrReplaceChild("octagon_r23", CubeListBuilder.create().texOffs(161, 15).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.0F, -7.0F, 0.5672F, -0.3927F, 0.0F));

		PartDefinition octagon_r24 = bone2.addOrReplaceChild("octagon_r24", CubeListBuilder.create().texOffs(36, 168).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -7.0F, 0.5672F, 0.3927F, 0.0F));

		PartDefinition octagon_r25 = bone2.addOrReplaceChild("octagon_r25", CubeListBuilder.create().texOffs(70, 168).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -5.0F, 0.5672F, 1.1781F, 0.0F));

		PartDefinition octagon_r26 = bone2.addOrReplaceChild("octagon_r26", CubeListBuilder.create().texOffs(171, 148).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, -6.0F, 0.5672F, -0.7854F, 0.0F));

		PartDefinition octagon_r27 = bone2.addOrReplaceChild("octagon_r27", CubeListBuilder.create().texOffs(160, 172).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, -2.5744F, -0.7854F, 3.1416F));

		PartDefinition octagon_r28 = bone2.addOrReplaceChild("octagon_r28", CubeListBuilder.create().texOffs(173, 71).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5744F, 0.7854F, 3.1416F));

		PartDefinition octagon_r29 = bone2.addOrReplaceChild("octagon_r29", CubeListBuilder.create().texOffs(174, 39).addBox(-2.4853F, -6.0F, -6.0F, 4.9706F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 1.0F, -2.5744F, 0.0F, 3.1416F));

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