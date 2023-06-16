// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class planetary_rocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "planetary_rocket"), "main");
	private final ModelPart all;

	public planetary_rocket(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition barrels = all.addOrReplaceChild("barrels", CubeListBuilder.create(), PartPose.offset(-66.0F, -3.0F, 0.0F));

		PartDefinition barrel1 = barrels.addOrReplaceChild("barrel1", CubeListBuilder.create().texOffs(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.2548F, 4.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.2548F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition octagon_r1 = barrel1.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.2548F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.2548F, 4.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel2 = barrels.addOrReplaceChild("barrel2", CubeListBuilder.create().texOffs(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.8823F, 6.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.8823F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition octagon_r2 = barrel2.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.8823F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.8823F, 6.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel3 = barrels.addOrReplaceChild("barrel3", CubeListBuilder.create().texOffs(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.196F, 8.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.196F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition octagon_r3 = barrel3.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.196F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.196F, 8.0F, 56.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel4 = barrels.addOrReplaceChild("barrel4", CubeListBuilder.create().texOffs(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.5097F, 4.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.5097F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition octagon_r4 = barrel4.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.5097F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.5097F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel5 = barrels.addOrReplaceChild("barrel5", CubeListBuilder.create().texOffs(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.8234F, 4.0F, 72.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.8234F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition octagon_r5 = barrel5.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.8234F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.8234F, 4.0F, 72.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel_lip1 = barrels.addOrReplaceChild("barrel_lip1", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition barrel_lip2 = barrels.addOrReplaceChild("barrel_lip2", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel_lip3 = barrels.addOrReplaceChild("barrel_lip3", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition barrel_lip4 = barrels.addOrReplaceChild("barrel_lip4", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.7854F, 3.1416F));

		PartDefinition barrel_lip5 = barrels.addOrReplaceChild("barrel_lip5", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition barrel_lip6 = barrels.addOrReplaceChild("barrel_lip6", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.7854F, 3.1416F));

		PartDefinition barrel_lip7 = barrels.addOrReplaceChild("barrel_lip7", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition barrel_lip8 = barrels.addOrReplaceChild("barrel_lip8", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition barrels3 = all.addOrReplaceChild("barrels3", CubeListBuilder.create(), PartPose.offset(69.0F, -3.0F, 0.0F));

		PartDefinition barrel11 = barrels3.addOrReplaceChild("barrel11", CubeListBuilder.create().texOffs(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.2548F, 4.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.2548F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition octagon_r6 = barrel11.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.2548F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.2548F, 4.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel12 = barrels3.addOrReplaceChild("barrel12", CubeListBuilder.create().texOffs(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.8823F, 6.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.8823F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition octagon_r7 = barrel12.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.8823F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.8823F, 6.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel13 = barrels3.addOrReplaceChild("barrel13", CubeListBuilder.create().texOffs(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.196F, 8.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.196F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition octagon_r8 = barrel13.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.196F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.196F, 8.0F, 56.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel14 = barrels3.addOrReplaceChild("barrel14", CubeListBuilder.create().texOffs(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.5097F, 4.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.5097F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition octagon_r9 = barrel14.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.5097F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.5097F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel15 = barrels3.addOrReplaceChild("barrel15", CubeListBuilder.create().texOffs(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.8234F, 4.0F, 72.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.8234F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition octagon_r10 = barrel15.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.8234F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.8234F, 4.0F, 72.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel_lip17 = barrels3.addOrReplaceChild("barrel_lip17", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition barrel_lip18 = barrels3.addOrReplaceChild("barrel_lip18", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel_lip19 = barrels3.addOrReplaceChild("barrel_lip19", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition barrel_lip20 = barrels3.addOrReplaceChild("barrel_lip20", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.7854F, 3.1416F));

		PartDefinition barrel_lip21 = barrels3.addOrReplaceChild("barrel_lip21", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition barrel_lip22 = barrels3.addOrReplaceChild("barrel_lip22", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.7854F, 3.1416F));

		PartDefinition barrel_lip23 = barrels3.addOrReplaceChild("barrel_lip23", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition barrel_lip24 = barrels3.addOrReplaceChild("barrel_lip24", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition barrels2 = all.addOrReplaceChild("barrels2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition barrel6 = barrels2.addOrReplaceChild("barrel6", CubeListBuilder.create().texOffs(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.2548F, 4.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.2548F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition octagon_r11 = barrel6.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.2548F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.2548F, 4.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel7 = barrels2.addOrReplaceChild("barrel7", CubeListBuilder.create().texOffs(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.8823F, 6.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.8823F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition octagon_r12 = barrel7.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.8823F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.8823F, 6.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel8 = barrels2.addOrReplaceChild("barrel8", CubeListBuilder.create().texOffs(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.196F, 8.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.196F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition octagon_r13 = barrel8.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.196F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.196F, 8.0F, 56.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel9 = barrels2.addOrReplaceChild("barrel9", CubeListBuilder.create().texOffs(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.5097F, 4.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.5097F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition octagon_r14 = barrel9.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.5097F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.5097F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel10 = barrels2.addOrReplaceChild("barrel10", CubeListBuilder.create().texOffs(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.8234F, 4.0F, 72.0F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.8234F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition octagon_r15 = barrel10.addOrReplaceChild("octagon_r15", CubeListBuilder.create().texOffs(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.8234F, new CubeDeformation(0.0F))
		.texOffs(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.8234F, 4.0F, 72.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel_lip9 = barrels2.addOrReplaceChild("barrel_lip9", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition barrel_lip10 = barrels2.addOrReplaceChild("barrel_lip10", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel_lip11 = barrels2.addOrReplaceChild("barrel_lip11", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition barrel_lip12 = barrels2.addOrReplaceChild("barrel_lip12", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.7854F, 3.1416F));

		PartDefinition barrel_lip13 = barrels2.addOrReplaceChild("barrel_lip13", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition barrel_lip14 = barrels2.addOrReplaceChild("barrel_lip14", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.7854F, 3.1416F));

		PartDefinition barrel_lip15 = barrels2.addOrReplaceChild("barrel_lip15", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition barrel_lip16 = barrels2.addOrReplaceChild("barrel_lip16", CubeListBuilder.create().texOffs(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tubes = all.addOrReplaceChild("tubes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tube1 = tubes.addOrReplaceChild("tube1", CubeListBuilder.create().texOffs(332, 177).addBox(-13.2548F, -80.0F, -32.0F, 26.5097F, 160.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(332, 177).addBox(-32.0F, -80.0F, -13.2548F, 64.0F, 160.0F, 26.5097F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -105.0F, 0.0F));

		PartDefinition octagon_r16 = tube1.addOrReplaceChild("octagon_r16", CubeListBuilder.create().texOffs(332, 177).addBox(-32.0F, -80.0F, -13.2548F, 64.0F, 160.0F, 26.5097F, new CubeDeformation(0.0F))
		.texOffs(332, 177).addBox(-13.2548F, -80.0F, -32.0F, 26.5097F, 160.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube2 = tubes.addOrReplaceChild("tube2", CubeListBuilder.create().texOffs(354, 148).addBox(-11.598F, -60.0F, -28.0F, 23.196F, 120.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(354, 148).addBox(-28.0F, -60.0F, -11.598F, 56.0F, 120.0F, 23.196F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -244.0F, 0.0F));

		PartDefinition octagon_r17 = tube2.addOrReplaceChild("octagon_r17", CubeListBuilder.create().texOffs(354, 148).addBox(-28.0F, -60.0F, -11.598F, 56.0F, 120.0F, 23.196F, new CubeDeformation(0.0F))
		.texOffs(354, 148).addBox(-11.598F, -60.0F, -28.0F, 23.196F, 120.0F, 56.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube3 = tubes.addOrReplaceChild("tube3", CubeListBuilder.create().texOffs(378, 69).addBox(-9.9411F, -32.0F, -24.0F, 19.8823F, 64.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(378, 69).addBox(-24.0F, -32.0F, -9.9411F, 48.0F, 64.0F, 19.8823F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -336.0F, 0.0F));

		PartDefinition octagon_r18 = tube3.addOrReplaceChild("octagon_r18", CubeListBuilder.create().texOffs(378, 69).addBox(-24.0F, -32.0F, -9.9411F, 48.0F, 64.0F, 19.8823F, new CubeDeformation(0.0F))
		.texOffs(378, 69).addBox(-9.9411F, -32.0F, -24.0F, 19.8823F, 64.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube4 = tubes.addOrReplaceChild("tube4", CubeListBuilder.create().texOffs(412, 0).addBox(-7.4558F, -18.0F, -18.0F, 14.9117F, 36.0F, 36.0F, new CubeDeformation(0.0F))
		.texOffs(412, 0).addBox(-18.0F, -18.0F, -7.4558F, 36.0F, 36.0F, 14.9117F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -386.0F, 0.0F));

		PartDefinition octagon_r19 = tube4.addOrReplaceChild("octagon_r19", CubeListBuilder.create().texOffs(412, 0).addBox(-18.0F, -18.0F, -7.4558F, 36.0F, 36.0F, 14.9117F, new CubeDeformation(0.0F))
		.texOffs(412, 0).addBox(-7.4558F, -18.0F, -18.0F, 14.9117F, 36.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition fuel_tanks = all.addOrReplaceChild("fuel_tanks", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition fuel_tank1 = fuel_tanks.addOrReplaceChild("fuel_tank1", CubeListBuilder.create().texOffs(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.5097F, 248.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.5097F, new CubeDeformation(0.0F)), PartPose.offset(-65.0F, -151.0F, 0.0F));

		PartDefinition octagon_r20 = fuel_tank1.addOrReplaceChild("octagon_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.5097F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.5097F, 248.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition fuel_tank2 = fuel_tanks.addOrReplaceChild("fuel_tank2", CubeListBuilder.create().texOffs(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.5097F, 248.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.5097F, new CubeDeformation(0.0F)), PartPose.offset(64.75F, -151.0F, 0.0F));

		PartDefinition octagon_r21 = fuel_tank2.addOrReplaceChild("octagon_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.5097F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.5097F, 248.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}