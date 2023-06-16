// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class terrier2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "terrier2"), "main");
	private final ModelPart all;

	public terrier2(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition tip = all.addOrReplaceChild("tip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r1 = tip.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1344F, -2.607F, 1.9535F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3656F, -44.1669F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = tip.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(46, 0).addBox(-1.1344F, -2.607F, -2.9535F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3656F, -44.1669F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = tip.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(36, 49).addBox(-1.5F, -4.0F, -1.2044F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -44.0F, -0.2956F, 0.0F, 0.0F, -0.3491F));

		PartDefinition hexadecagon_r4 = tip.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(36, 59).addBox(0.5F, -4.0F, -1.2044F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -44.0F, -0.2956F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cap = tip.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(82, 65).addBox(-8.5967F, -1.0F, 5.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 45).addBox(-8.5967F, -1.0F, 9.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(86, 28).addBox(-7.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(36, 85).addBox(-11.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -42.0F, -8.0F));

		PartDefinition hexadecagon_r5 = cap.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(70, 84).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(76, 85).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(82, 41).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 61).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = cap.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(85, 36).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(86, 39).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(82, 49).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 69).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r7 = cap.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 57).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r8 = cap.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(82, 53).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 73).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon2 = cap.addOrReplaceChild("hexadecagon2", CubeListBuilder.create().texOffs(36, 77).addBox(-8.5967F, -1.0F, 5.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 69).addBox(-8.5967F, -1.0F, 9.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(81, 83).addBox(-7.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(83, 0).addBox(-11.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition hexadecagon_r9 = hexadecagon2.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(82, 80).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(83, 33).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(56, 42).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 75).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r10 = hexadecagon2.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(83, 4).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(64, 84).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(40, 71).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 79).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r11 = hexadecagon2.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(10, 52).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(74, 37).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r12 = hexadecagon2.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(36, 73).addBox(-0.5967F, -1.0F, 1.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 37).addBox(-0.5967F, -1.0F, -3.0F, 1.1935F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 0).addBox(-8.7956F, -33.0F, 4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(56, 0).addBox(-12.0F, -33.0F, 7.2044F, 8.0F, 41.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -8.0F, -8.0F));

		PartDefinition hexadecagon_r13 = body.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(18, 49).addBox(-4.0F, -33.0F, -0.7956F, 8.0F, 41.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(18, 0).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r14 = body.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(64, 42).addBox(-4.0F, -33.0F, -0.7956F, 8.0F, 41.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(46, 41).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r15 = body.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r16 = body.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(0, 49).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition fins_top = all.addOrReplaceChild("fins_top", CubeListBuilder.create().texOffs(10, 0).addBox(-8.0F, -2.0F, 0.2044F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 0).mirror().addBox(2.0F, -2.0F, 0.2044F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(74, 22).addBox(0.2044F, -2.0F, 2.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -38.0F, 0.0F));

		PartDefinition hexadecagon_r17 = fins_top.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2044F, 0.5F, -5.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition fins_bottom = all.addOrReplaceChild("fins_bottom", CubeListBuilder.create().texOffs(74, 18).addBox(-9.0F, -2.0F, 0.2044F, 8.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(74, 18).mirror().addBox(1.0F, -2.0F, 0.2044F, 8.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(74, 0).addBox(0.2044F, -2.0F, 1.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition hexadecagon_r18 = fins_bottom.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(74, 0).addBox(0.0F, -5.0F, -4.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2044F, 3.0F, -5.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition thruster = all.addOrReplaceChild("thruster", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = thruster.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 0).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r2 = thruster.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 4).addBox(-1.5F, -1.5F, 0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r3 = thruster.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 0).addBox(0.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.0F, 0.0F, -2.2253F));

		PartDefinition cube_r4 = thruster.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 33).addBox(-3.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 2.2253F));

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