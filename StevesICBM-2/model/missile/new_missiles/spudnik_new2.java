// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class spudnik_new2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "spudnik_new2"), "main");
	private final ModelPart all;

	public spudnik_new2(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Thruster = all.addOrReplaceChild("Thruster", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition ThrusterBase = Thruster.addOrReplaceChild("ThrusterBase", CubeListBuilder.create().texOffs(71, 6).addBox(-0.5F, -1.0355F, -2.5F, 2.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 0).addBox(-0.5F, -1.0355F, 1.5F, 2.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-0.5F, 1.5F, -1.0355F, 2.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F))
		.texOffs(18, 53).addBox(-0.5F, -2.5F, -1.0355F, 2.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r1 = ThrusterBase.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(27, 53).addBox(4.5F, -2.5F, -1.0355F, 2.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F))
		.texOffs(18, 59).addBox(4.5F, 1.5F, -1.0355F, 2.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F))
		.texOffs(69, 44).addBox(4.5F, -1.0355F, 1.5F, 2.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 12).addBox(4.5F, -1.0355F, -2.5F, 2.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition ThrusterFins = Thruster.addOrReplaceChild("ThrusterFins", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition cube_r1 = ThrusterFins.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 70).addBox(-2.0625F, -1.75F, -0.5F, 4.125F, 3.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1927F, -2.6253F, -0.0086F, 0.4363F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = ThrusterFins.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 60).addBox(-2.0625F, -1.75F, -0.5F, 4.125F, 3.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1927F, -2.6253F, -0.0086F, -0.4363F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = ThrusterFins.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 66).addBox(-2.0625F, -1.75F, -0.5F, 4.125F, 3.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0086F, -2.6253F, -5.1927F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = ThrusterFins.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 72).addBox(-2.0625F, -1.75F, -0.5F, 4.125F, 3.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0086F, -2.6253F, 5.1927F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Bottom = Thruster.addOrReplaceChild("Bottom", CubeListBuilder.create().texOffs(0, 59).addBox(-2.05F, -0.25F, -4.25F, 4.1F, 0.5F, 8.5F, new CubeDeformation(0.0F)), PartPose.offset(-0.0211F, -11.25F, 0.25F));

		PartDefinition cube_r5 = Bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 48).addBox(-2.325F, -0.25F, -4.25F, 4.1F, 0.5F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r6 = Bottom.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 50).addBox(-2.325F, -0.25F, -4.25F, 4.1F, 0.5F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = Bottom.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 48).addBox(-2.325F, -0.25F, -4.25F, 4.1F, 0.5F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition ThrusterBottom = Thruster.addOrReplaceChild("ThrusterBottom", CubeListBuilder.create().texOffs(14, 76).addBox(-2.0F, -0.3978F, -2.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 74).addBox(-2.0F, -0.3978F, 1.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 15).addBox(-2.0F, 1.0F, -0.3978F, 2.0F, 1.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(60, 76).addBox(-2.0F, -2.0F, -0.3978F, 2.0F, 1.0F, 0.7956F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r1 = ThrusterBottom.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(53, 76).addBox(-2.0F, -2.0F, -0.3978F, 2.0F, 1.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(77, 9).addBox(-2.0F, 1.0F, -0.3978F, 2.0F, 1.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(26, 74).addBox(-2.0F, -0.3978F, 1.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 21).addBox(-2.0F, -0.3978F, -2.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = ThrusterBottom.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(77, 3).addBox(-2.0F, -2.0F, -0.3978F, 2.0F, 1.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(21, 77).addBox(-2.0F, 1.0F, -0.3978F, 2.0F, 1.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(40, 74).addBox(-2.0F, -0.3978F, 1.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 44).addBox(-2.0F, -0.3978F, -2.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = ThrusterBottom.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(71, 18).addBox(-2.0F, -0.3978F, 1.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 75).addBox(-2.0F, -0.3978F, -2.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r4 = ThrusterBottom.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 75).addBox(-2.0F, -0.3978F, 1.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 76).addBox(-2.0F, -0.3978F, -2.0F, 2.0F, 0.7956F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(0, 36).addBox(-12.5F, -2.0711F, -5.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-12.5F, -2.0711F, 4.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 12).addBox(-12.5F, 4.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.5F, -5.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r2 = tube.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 6).addBox(-12.5F, -5.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-12.5F, 4.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-12.5F, -2.0711F, 4.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-12.5F, -2.0711F, -5.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Top = all.addOrReplaceChild("Top", CubeListBuilder.create(), PartPose.offset(0.0F, -24.7F, 0.0F));

		PartDefinition Lower = Top.addOrReplaceChild("Lower", CubeListBuilder.create().texOffs(69, 39).addBox(-14.5F, -1.6569F, -4.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 48).addBox(-14.5F, -1.6569F, 3.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(69, 24).addBox(-14.5F, 3.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(63, 48).addBox(-14.5F, -4.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r3 = Lower.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(63, 53).addBox(-14.5F, -4.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(69, 29).addBox(-14.5F, 3.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(69, 34).addBox(-14.5F, -1.6569F, 3.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-14.5F, -1.6569F, -4.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Upper = Top.addOrReplaceChild("Upper", CubeListBuilder.create().texOffs(0, 63).addBox(-10.5F, -1.2426F, -3.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 61).addBox(-10.5F, -1.2426F, 2.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 52).addBox(-10.5F, 2.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-10.5F, -3.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r4 = Upper.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(45, 48).addBox(-10.5F, -3.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F))
		.texOffs(45, 52).addBox(-10.5F, 2.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F))
		.texOffs(34, 59).addBox(-10.5F, -1.2426F, 2.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 63).addBox(-10.5F, -1.2426F, -3.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone2 = Top.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.4253F, -8.2885F, 0.0711F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 61).addBox(-0.5F, -13.0F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 61).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.1966F, -5.2454F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone = Top.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.9182F, 0.0711F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 59).addBox(-0.5F, -13.0F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4253F, 7.6297F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 59).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7714F, 2.3843F, 0.0F, 0.0F, 0.0F, 0.3054F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}