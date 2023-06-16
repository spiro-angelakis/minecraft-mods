// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class bunker_buster_missile_downward<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bunker_buster_missile_downward"), "main");
	private final ModelPart all;

	public bunker_buster_missile_downward(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -49.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition ThrusterAll = all.addOrReplaceChild("ThrusterAll", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition thruster = ThrusterAll.addOrReplaceChild("thruster", CubeListBuilder.create().texOffs(0, 122).addBox(-8.7956F, -10.0F, 4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 4.0F, -8.0F));

		PartDefinition hexadecagon_r1 = thruster.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(17, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(121, 32).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = thruster.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(133, 58).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(93, 123).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = thruster.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(121, 19).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = thruster.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(123, 102).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Flaps = ThrusterAll.addOrReplaceChild("Flaps", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth_flap3 = Flaps.addOrReplaceChild("mouth_flap3", CubeListBuilder.create().texOffs(28, 7).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.618F, 0.0F, -3.1416F));

		PartDefinition mouth_flap2 = Flaps.addOrReplaceChild("mouth_flap2", CubeListBuilder.create().texOffs(46, 7).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.5236F));

		PartDefinition mouth_flap4 = Flaps.addOrReplaceChild("mouth_flap4", CubeListBuilder.create().texOffs(17, 7).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.5236F));

		PartDefinition mouth_flap1 = Flaps.addOrReplaceChild("mouth_flap1", CubeListBuilder.create().texOffs(57, 7).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Body = all.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(46, 49).addBox(-9.1935F, -32.0F, 2.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(92, 0).addBox(-14.0F, -32.0F, 6.8065F, 12.0F, 48.0F, 2.3869F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -20.0F, -8.0F));

		PartDefinition hexadecagon_r5 = Body.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(75, 61).addBox(-6.0F, -24.0F, -1.1935F, 12.0F, 48.0F, 2.3869F, new CubeDeformation(0.0F))
		.texOffs(29, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = Body.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(104, 51).addBox(-6.0F, -24.0F, -1.1935F, 12.0F, 48.0F, 2.3869F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r7 = Body.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r8 = Body.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(63, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition LowerFlaps = Body.addOrReplaceChild("LowerFlaps", CubeListBuilder.create(), PartPose.offset(-8.0F, -36.0F, 8.0F));

		PartDefinition tube1_flap1 = LowerFlaps.addOrReplaceChild("tube1_flap1", CubeListBuilder.create().texOffs(67, 112).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 46.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition tube1_flap2 = LowerFlaps.addOrReplaceChild("tube1_flap2", CubeListBuilder.create().texOffs(48, 110).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 46.0F, 0.0F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition tube1_flap3 = LowerFlaps.addOrReplaceChild("tube1_flap3", CubeListBuilder.create().texOffs(29, 110).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 46.0F, 0.0F, -3.1416F, 0.0F, 2.7489F));

		PartDefinition tube1_flap4 = LowerFlaps.addOrReplaceChild("tube1_flap4", CubeListBuilder.create().texOffs(104, 102).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 46.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition tip = all.addOrReplaceChild("tip", CubeListBuilder.create(), PartPose.offset(8.0F, -60.0F, -8.0F));

		PartDefinition TopTip = tip.addOrReplaceChild("TopTip", CubeListBuilder.create().texOffs(133, 65).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.7956F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -8.0F, 8.0F));

		PartDefinition hexadecagon_r9 = TopTip.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(110, 132).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r10 = TopTip.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(17, 61).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(133, 78).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r11 = TopTip.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(81, 131).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r12 = TopTip.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(121, 134).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition TipFins = tip.addOrReplaceChild("TipFins", CubeListBuilder.create(), PartPose.offset(-8.0F, 4.0F, 8.0F));

		PartDefinition tube2_flap1 = TipFins.addOrReplaceChild("tube2_flap1", CubeListBuilder.create().texOffs(133, 45).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition tube2_flap2 = TipFins.addOrReplaceChild("tube2_flap2", CubeListBuilder.create().texOffs(132, 128).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 2.7489F));

		PartDefinition tube2_flap3 = TipFins.addOrReplaceChild("tube2_flap3", CubeListBuilder.create().texOffs(132, 115).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition tube2_flap4 = TipFins.addOrReplaceChild("tube2_flap4", CubeListBuilder.create().texOffs(66, 131).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition LowerSection = tip.addOrReplaceChild("LowerSection", CubeListBuilder.create().texOffs(86, 112).addBox(-8.5967F, -14.0F, 5.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(36, 129).addBox(-11.0F, -14.0F, 7.4033F, 6.0F, 12.0F, 1.1935F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition hexadecagon_r13 = LowerSection.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(21, 129).addBox(-3.0F, -6.0F, -0.5967F, 6.0F, 12.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(29, 80).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r14 = LowerSection.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(51, 129).addBox(-3.0F, -6.0F, -0.5967F, 6.0F, 12.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(117, 115).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r15 = LowerSection.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(29, 61).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r16 = LowerSection.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

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