// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class spudnik<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "spudnik"), "main");
	private final ModelPart all;

	public spudnik(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(0, 30).addBox(-12.5F, -2.0711F, -5.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-12.5F, -2.0711F, 4.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-12.5F, 4.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.5F, -5.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(20.0F, -4.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -25.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r1 = tube.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-12.5F, -5.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-12.5F, 4.0F, -2.0711F, 33.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-12.5F, -2.0711F, 4.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-12.5F, -2.0711F, -5.0F, 33.0F, 4.1421F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cone1 = tube.addOrReplaceChild("cone1", CubeListBuilder.create().texOffs(42, 45).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, -4.0F, -2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cone2 = tube.addOrReplaceChild("cone2", CubeListBuilder.create().texOffs(18, 45).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, 4.0F, 2.0F, 3.1174F, 0.01F, 0.3926F));

		PartDefinition cone3 = tube.addOrReplaceChild("cone3", CubeListBuilder.create().texOffs(34, 40).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, 2.0F, -4.0F, 1.5802F, 0.3927F, 0.0036F));

		PartDefinition cone4 = tube.addOrReplaceChild("cone4", CubeListBuilder.create().texOffs(10, 40).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, -2.0F, 3.9F, -1.5141F, -0.3921F, -0.0217F));

		PartDefinition cone8 = tube.addOrReplaceChild("cone8", CubeListBuilder.create().texOffs(29, 54).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, -4.0F, -2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cone7 = tube.addOrReplaceChild("cone7", CubeListBuilder.create().texOffs(39, 55).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, 4.0F, 2.0F, 3.1174F, 0.01F, 0.3926F));

		PartDefinition cone6 = tube.addOrReplaceChild("cone6", CubeListBuilder.create().texOffs(53, 55).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, 2.0F, -4.0F, 1.5802F, 0.3927F, 0.0036F));

		PartDefinition cone5 = tube.addOrReplaceChild("cone5", CubeListBuilder.create().texOffs(0, 56).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.1421F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4F, -2.0F, 3.9F, -1.5141F, -0.3921F, -0.0217F));

		PartDefinition bone = tube.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition base = all.addOrReplaceChild("base", CubeListBuilder.create().texOffs(63, 55).addBox(3.0F, -1.0355F, -2.5F, 4.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 44).addBox(3.0F, -1.0355F, 1.5F, 4.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(3.0F, 1.5F, -1.0355F, 4.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F))
		.texOffs(10, 45).addBox(3.0F, -2.5F, -1.0355F, 4.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r2 = base.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(56, 60).addBox(3.0F, -2.5F, -1.0355F, 4.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F))
		.texOffs(10, 62).addBox(3.0F, 1.5F, -1.0355F, 4.0F, 1.0F, 2.0711F, new CubeDeformation(0.0F))
		.texOffs(55, 63).addBox(3.0F, -1.0355F, 1.5F, 4.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(3.0F, -1.0355F, -2.5F, 4.0F, 2.0711F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cap = all.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(28, 60).addBox(-1.0F, -1.6569F, -4.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 40).addBox(-1.0F, -1.6569F, 3.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 51).addBox(-1.0F, 3.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(18, 50).addBox(-1.0F, -4.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.7F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r3 = cap.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(36, 50).addBox(-1.0F, -4.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(15, 54).addBox(-1.0F, 3.0F, -1.6569F, 6.0F, 1.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(14, 58).addBox(-1.0F, -1.6569F, 3.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 60).addBox(-1.0F, -1.6569F, -4.0F, 6.0F, 3.3137F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition lid = all.addOrReplaceChild("lid", CubeListBuilder.create().texOffs(22, 62).addBox(3.0F, -1.2426F, -3.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 50).addBox(3.0F, -1.2426F, 2.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(3.0F, 2.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(3.0F, -3.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -44.7F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition octagon_r4 = lid.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(30, 40).addBox(3.0F, -3.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F))
		.texOffs(38, 45).addBox(3.0F, 2.0F, -1.2426F, 2.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F))
		.texOffs(49, 55).addBox(3.0F, -1.2426F, 2.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 64).addBox(3.0F, -1.2426F, -3.0F, 2.0F, 2.4853F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

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