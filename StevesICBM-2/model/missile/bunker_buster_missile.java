// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class bunker_buster_missile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bunker_buster_missile"), "main");
	private final ModelPart all;

	public bunker_buster_missile(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition mouth = all.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(46, 0).addBox(-8.7956F, -10.0F, 4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 6.0F, -8.0F));

		PartDefinition hexadecagon_r1 = mouth.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(46, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = mouth.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(46, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = mouth.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = mouth.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tube1 = all.addOrReplaceChild("tube1", CubeListBuilder.create().texOffs(0, 0).addBox(-9.1935F, -32.0F, 2.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-14.0F, -32.0F, 6.8065F, 12.0F, 48.0F, 2.3869F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -20.0F, -8.0F));

		PartDefinition hexadecagon_r5 = tube1.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -24.0F, -1.1935F, 12.0F, 48.0F, 2.3869F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = tube1.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -24.0F, -1.1935F, 12.0F, 48.0F, 2.3869F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r7 = tube1.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r8 = tube1.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.3869F, 48.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition mouth_flap1 = all.addOrReplaceChild("mouth_flap1", CubeListBuilder.create().texOffs(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition mouth_flap2 = all.addOrReplaceChild("mouth_flap2", CubeListBuilder.create().texOffs(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, -1.5708F, -0.5236F));

		PartDefinition mouth_flap3 = all.addOrReplaceChild("mouth_flap3", CubeListBuilder.create().texOffs(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 2.618F, 0.0F, -3.1416F));

		PartDefinition mouth_flap4 = all.addOrReplaceChild("mouth_flap4", CubeListBuilder.create().texOffs(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 0.5236F));

		PartDefinition tube2 = all.addOrReplaceChild("tube2", CubeListBuilder.create().texOffs(0, 28).addBox(-8.5967F, -14.0F, 5.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-11.0F, -14.0F, 7.4033F, 6.0F, 12.0F, 1.1935F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -50.0F, -8.0F));

		PartDefinition hexadecagon_r9 = tube2.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, -6.0F, -0.5967F, 6.0F, 12.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r10 = tube2.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, -6.0F, -0.5967F, 6.0F, 12.0F, 1.1935F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r11 = tube2.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r12 = tube2.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.1935F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tube1_flap1 = all.addOrReplaceChild("tube1_flap1", CubeListBuilder.create().texOffs(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition tube1_flap2 = all.addOrReplaceChild("tube1_flap2", CubeListBuilder.create().texOffs(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition tube1_flap3 = all.addOrReplaceChild("tube1_flap3", CubeListBuilder.create().texOffs(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -3.1416F, 0.0F, 2.7489F));

		PartDefinition tube1_flap4 = all.addOrReplaceChild("tube1_flap4", CubeListBuilder.create().texOffs(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition tube2_flap1 = all.addOrReplaceChild("tube2_flap1", CubeListBuilder.create().texOffs(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition tube2_flap2 = all.addOrReplaceChild("tube2_flap2", CubeListBuilder.create().texOffs(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, 0.0F, -3.1416F, 0.0F, 2.7489F));

		PartDefinition tube2_flap3 = all.addOrReplaceChild("tube2_flap3", CubeListBuilder.create().texOffs(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, 0.0F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition tube2_flap4 = all.addOrReplaceChild("tube2_flap4", CubeListBuilder.create().texOffs(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition tip = all.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(56, 27).addBox(-8.3978F, -12.0F, 6.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 27).addBox(-10.0F, -12.0F, 7.6022F, 4.0F, 8.0F, 0.7956F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -60.0F, -8.0F));

		PartDefinition hexadecagon_r13 = tip.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(56, 27).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r14 = tip.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(56, 27).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.7956F, new CubeDeformation(0.0F))
		.texOffs(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r15 = tip.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r16 = tip.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.7956F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

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