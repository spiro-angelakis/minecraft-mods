// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class space_crate_entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "space_crate_entity"), "main");
	private final ModelPart all;

	public space_crate_entity(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(8, 44).addBox(-8.0F, -16.0F, -8.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 44).addBox(7.0F, -16.0F, -8.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(7.0F, -16.0F, 7.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 43).addBox(-8.0F, -16.0F, 7.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 29).addBox(-7.0F, -1.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 12).addBox(-7.0F, -16.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 10).addBox(-7.0F, -16.0F, -8.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 8).addBox(-7.0F, -1.0F, -8.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = all.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 0).addBox(-7.0F, -1.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 2).addBox(-7.0F, -16.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 4).addBox(-7.0F, -16.0F, -8.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 6).addBox(-7.0F, -1.0F, -8.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition slants = all.addOrReplaceChild("slants", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition slant1 = slants.addOrReplaceChild("slant1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = slant1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 40).addBox(-10.5F, -0.5F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.005F, -0.0707F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r3 = slant1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 42).addBox(-10.9F, -0.2F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.5F, 0.0F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition slant2 = slants.addOrReplaceChild("slant2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = slant2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 36).addBox(-10.5F, -0.5F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.005F, -0.0707F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r5 = slant2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 38).addBox(-10.9F, -0.2F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.5F, 0.0F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition slant3 = slants.addOrReplaceChild("slant3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r6 = slant3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 32).addBox(-10.5F, -0.5F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.005F, -0.0707F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r7 = slant3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 34).addBox(-10.9F, -0.2F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.5F, 0.0F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition slant4 = slants.addOrReplaceChild("slant4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = slant4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 28).addBox(-10.5F, -0.5F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.005F, -0.0707F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r9 = slant4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 30).addBox(-10.9F, -0.2F, -0.5F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -8.5F, 0.0F, 1.5708F, -0.7854F, -1.5708F));

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