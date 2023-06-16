// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class emp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "emp"), "main");
	private final ModelPart all;

	public emp(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5913F, -33.0F, 0.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-16.0F, -33.0F, 6.4087F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -24.0F, -8.0F));

		PartDefinition hexadecagon_r1 = tube.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -25.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = tube.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -25.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = tube.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = tube.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cusp = all.addOrReplaceChild("cusp", CubeListBuilder.create().texOffs(0, 70).addBox(-9.7902F, -10.0F, -1.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-17.0F, -10.0F, 6.2098F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 3.0F, -8.0F));

		PartDefinition hexadecagon_r5 = cusp.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(0, 70).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = cusp.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(0, 70).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r7 = cusp.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r8 = cusp.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition barrel = all.addOrReplaceChild("barrel", CubeListBuilder.create().texOffs(0, 95).addBox(-8.7956F, -10.0F, 4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 7.0F, -8.0F));

		PartDefinition hexadecagon_r9 = barrel.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(0, 95).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r10 = barrel.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(0, 95).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r11 = barrel.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r12 = barrel.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition flap1 = all.addOrReplaceChild("flap1", CubeListBuilder.create().texOffs(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition flap2 = all.addOrReplaceChild("flap2", CubeListBuilder.create().texOffs(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8362F, -1.4835F, 3.1416F));

		PartDefinition flap3 = all.addOrReplaceChild("flap3", CubeListBuilder.create().texOffs(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8362F, 0.0873F, 3.1416F));

		PartDefinition flap4 = all.addOrReplaceChild("flap4", CubeListBuilder.create().texOffs(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 1.4835F, 0.0F));

		PartDefinition head = all.addOrReplaceChild("head", CubeListBuilder.create().texOffs(56, 0).addBox(-9.0F, -6.0F, -9.0F, 18.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -57.0F, 0.0F));

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