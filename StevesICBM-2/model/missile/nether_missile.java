// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class nether_missile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "nether_missile"), "main");
	private final ModelPart all;

	public nether_missile(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition base = all.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 32).addBox(-12.9706F, -12.0F, -4.0F, 9.9411F, 8.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-20.0F, -12.0F, 3.0294F, 24.0F, 8.0F, 9.9411F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 3.25F, -8.0F));

		PartDefinition octagon_r1 = base.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-12.0F, -4.0F, -4.9706F, 24.0F, 8.0F, 9.9411F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-4.9706F, -4.0F, -12.0F, 9.9411F, 8.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition base_lid = all.addOrReplaceChild("base_lid", CubeListBuilder.create().texOffs(0, 46).addBox(-11.3137F, -9.0F, 0.0F, 6.6274F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-16.0F, -9.0F, 4.6863F, 16.0F, 2.0F, 6.6274F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -1.75F, -8.0F));

		PartDefinition octagon_r2 = base_lid.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-8.0F, -1.0F, -3.3137F, 16.0F, 2.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-3.3137F, -1.0F, -8.0F, 6.6274F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition base_stem = all.addOrReplaceChild("base_stem", CubeListBuilder.create().texOffs(42, 31).addBox(-9.6569F, -10.0F, 4.0F, 3.3137F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(42, 31).addBox(-12.0F, -10.0F, 6.3431F, 8.0F, 4.0F, 3.3137F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -4.75F, -8.0F));

		PartDefinition octagon_r3 = base_stem.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(42, 31).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(42, 31).addBox(-1.6569F, -2.0F, -4.0F, 3.3137F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5913F, -26.0F, 0.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-16.0F, -26.0F, 6.4087F, 16.0F, 36.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -25.0F, -8.0F));

		PartDefinition hexadecagon_r1 = tube.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = tube.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = tube.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = tube.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cap = all.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(20, 40).addBox(-11.3137F, -12.0F, 0.0F, 6.6274F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(20, 40).addBox(-16.0F, -12.0F, 4.6863F, 16.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -47.0F, -8.0F));

		PartDefinition octagon_r4 = cap.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(20, 40).addBox(-8.0F, -4.0F, -3.3137F, 16.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(20, 40).addBox(-3.3137F, -4.0F, -8.0F, 6.6274F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

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