// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class anti_air_missile_new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "anti_air_missile_new"), "main");
	private final ModelPart all;

	public anti_air_missile_new(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8284F, -6.5F, -2.0F, 1.6569F, 16.5F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-2.0F, -6.5F, -0.8284F, 4.0F, 16.5F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition octagon_r1 = tube.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(13, 22).addBox(-2.0F, -6.5F, -0.8284F, 4.0F, 16.5F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(13, 0).addBox(-0.8284F, -6.5F, -2.0F, 1.6569F, 16.5F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel = all.addOrReplaceChild("barrel", CubeListBuilder.create().texOffs(26, 0).addBox(-0.6213F, -1.0F, -1.5F, 1.2426F, 1.5F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 12).addBox(-1.5F, -1.0F, -0.6213F, 3.0F, 1.5F, 1.2426F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition octagon_r2 = barrel.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(26, 16).addBox(-1.5F, -1.0F, -0.6213F, 3.0F, 1.5F, 1.2426F, new CubeDeformation(0.0F))
		.texOffs(26, 6).addBox(-0.6213F, -1.0F, -1.5F, 1.2426F, 1.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tip = all.addOrReplaceChild("tip", CubeListBuilder.create(), PartPose.offset(1.39F, -19.3238F, 0.0F));

		PartDefinition cube_r1 = tip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 26).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4071F, 0.0F, -0.9829F, -2.7761F, -0.7119F, 2.6117F));

		PartDefinition cube_r2 = tip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 20).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3729F, 0.0F, 0.9829F, 2.7761F, -0.7119F, -2.6117F));

		PartDefinition cube_r3 = tip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 26).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.39F, 0.0F, -1.39F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition cube_r4 = tip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 20).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.39F, 0.0F, 1.39F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition cube_r5 = tip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 32).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4148F, 0.0F, -0.9391F, -0.3373F, -0.6741F, 0.5119F));

		PartDefinition cube_r6 = tip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 32).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3652F, 0.0F, 0.9391F, 0.3373F, -0.6741F, -0.5119F));

		PartDefinition cube_r7 = tip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 0).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.78F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r8 = tip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(35, 6).addBox(-0.25F, -3.0F, -0.5F, 0.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition BottomFins = all.addOrReplaceChild("BottomFins", CubeListBuilder.create(), PartPose.offset(-0.11F, -3.8238F, 0.0F));

		PartDefinition bone3 = BottomFins.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(36, 38).addBox(-3.875F, 3.0F, 0.0F, 1.5F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-3.375F, -2.0F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 27).addBox(-3.875F, -0.5F, 0.0F, 2.0F, 3.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 10).addBox(-4.375F, 1.5F, 0.0F, 0.5F, 2.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = BottomFins.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(40, 0).addBox(2.625F, 9.0F, 0.0F, 1.5F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 40).addBox(4.125F, 7.5F, 0.0F, 0.5F, 2.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 17).addBox(2.125F, 5.5F, 0.0F, 2.0F, 3.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 35).addBox(2.125F, 4.0F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition bone6 = BottomFins.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(26, 38).addBox(2.625F, 9.0F, 0.0F, 1.5F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 2).addBox(4.125F, 7.5F, 0.0F, 0.5F, 2.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(35, 12).addBox(2.125F, 5.5F, 0.0F, 2.0F, 3.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 32).addBox(2.125F, 4.0F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -0.15F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone5 = BottomFins.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(31, 38).addBox(-3.875F, 3.0F, 0.0F, 1.5F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 6).addBox(-3.375F, -2.0F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 22).addBox(-3.875F, -0.5F, 0.0F, 2.0F, 3.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 6).addBox(-4.375F, 1.5F, 0.0F, 0.5F, 2.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.15F, 0.0F, -1.5708F, 0.0F));

		PartDefinition topFins = all.addOrReplaceChild("topFins", CubeListBuilder.create(), PartPose.offset(-0.11F, -15.3238F, 0.0F));

		PartDefinition bone4 = topFins.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(41, 16).addBox(-2.875F, -1.0F, 0.0F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(14, 0).addBox(-3.375F, -0.5F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(29, 40).addBox(-3.875F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(1, 22).addBox(-2.875F, 1.0F, 0.0F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(3, 2).addBox(-3.875F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone7 = topFins.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(35, 40).addBox(2.125F, 5.0F, 0.0F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(9, 0).addBox(2.125F, 5.5F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 6).addBox(3.125F, 7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(41, 24).addBox(2.625F, 7.0F, 0.0F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(41, 20).addBox(3.625F, 6.0F, 0.0F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition bone8 = topFins.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(32, 40).addBox(2.125F, 5.0F, 0.0F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(22, 0).addBox(2.125F, 5.5F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(11, 22).addBox(3.125F, 7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(41, 22).addBox(2.625F, 7.0F, 0.0F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(41, 18).addBox(3.625F, 6.0F, 0.0F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -0.15F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone9 = topFins.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(38, 40).addBox(-2.875F, -1.0F, 0.0F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.375F, -0.5F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 14).addBox(-3.875F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-2.875F, 1.0F, 0.0F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(3, 0).addBox(-3.875F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.15F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}